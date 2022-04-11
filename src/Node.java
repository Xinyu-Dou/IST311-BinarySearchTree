public class Node<T> {
    Node<T> left;
    Node<T> right;
    Integer data;

    public Node(Integer data){
        this.left = null;
        this.right = null;
        this.data = data;
    }


    @Override
    public String toString(){
        return data.toString();
    }
}

