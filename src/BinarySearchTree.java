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

        if (data.compareTo(current.data) == -1) {
            current.left = this.insertNode(current.left, data);
        } else if (data.compareTo(current.data) == 1) {
            current.right = this.insertNode(current.right, data);
        }

        return current;
    }

    public Node delete(Integer data){
        return deleteNode(this.root, data);
    }

    public Node deleteNode(Node current, Integer data){
        if(current.data == data){
            Node result = current;
            current.data = minValue(current.right);
            return result;
        }
        if(current.data > data){
            deleteNode(current.left,data);
        }
        else{
            deleteNode(current.right,data);
        }
        return null;
    }

    public int minValue(Node root){
        int minimum = root.data;
        while (root.left != null){
            minimum = root.left.data;
            root = root.left;
        }
        if(root.right != null){
            root = root.right;
        }
        else{
            root = null;
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
