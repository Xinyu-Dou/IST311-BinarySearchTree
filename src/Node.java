public class Node<T> {
    Node<T> left;
    Node<T> right;
    Album data;

    public Node(Album data){
        this.left = null;
        this.right = null;
        this.data = data;
    }


    @Override
    public String toString(){
        return data.toString();
    }
}

