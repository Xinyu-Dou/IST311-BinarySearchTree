public class BinarySearchTree {
    Node root;

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

        return null;
    }
}
