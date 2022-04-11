public class BinarySearchTree {
    protected Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(Integer data) {
        this.root = insertNode(this.root, data);
    }

    private Node insertNode(Node current, Integer data) {
        //if the current is null, just return the node
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = this.insertNode(current.left, data);
        } else if (data > current.data) {
            current.right = this.insertNode(current.right, data);
        }

        return current;
    }

    public Node delete(Integer data){
        return deleteNode(this.root, data);
    }

    public Node deleteNode(Node current, Integer data){
        try{
            if (current == null) {
                throw new IndexOutOfBoundsException();
            }
            if (current.data == data) {
                Node result = current;
                current.data = minValue(current.right, current);
                return result;
            }
            if (current.data > data) {
                deleteNode(current.left, data);
            } else {
                deleteNode(current.right, data);
            }
        }catch (Exception e){
            System.out.println("This Album to delete is not in the tree!!");
        }
        return null;
    }

    public boolean contains(Integer data){
        return this.containsHelper(this.root, data);
    }

    private boolean containsHelper(Node current, Integer data){
        if(current != null){
            if(current.data == data){
                return true;
            }else{
                if(data>current.data){
                    return containsHelper(current.right, data);
                }
                else{
                    return containsHelper(current.left, data);
                }
            }
        }
        return false;
    }

    public int minValue(Node curr_root, Node pre_root){
        int minimum = curr_root.data;
        while (curr_root.left != null){
            minimum = curr_root.left.data;
            pre_root = curr_root;
            curr_root = curr_root.left;
        }
        if(curr_root.right != null){
            pre_root.right = curr_root.right;
        }
        else{
            pre_root.left = null;
        }
        return minimum;
    }

    public String inOrderTraversal(){
        return this.inOrderTraversalNode(this.root);
    }

    private String inOrderTraversalNode(Node current){
        StringBuilder stringBuilder = new StringBuilder();

        if(current != null){
            //go left first because this is in order
            stringBuilder.append(this.inOrderTraversalNode(current.left));

            //append the current node
            stringBuilder.append(current.data);
            stringBuilder.append(" ");

            //go right
            stringBuilder.append(this.inOrderTraversalNode(current.right));
        }
        return stringBuilder.toString();
    }


}
