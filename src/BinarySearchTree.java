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

        return null;
    }

    public Node delete(Integer data){
        return deleteNode(this.root, data);
    }

    public Node deleteNode(Node current, Integer data){
        if (root == null){
            return root;
        }

        if(data < current.data){
            current.left = this.insertNode(current.left, data);
        }

        else{
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }

            //node with tw children
            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    public int minValue(Node root){
        int minimum = root.data;
        while (root.left != null){
            minimum = root.left.data;
            root = root.left;
        }
        return minimum;
    }

}
