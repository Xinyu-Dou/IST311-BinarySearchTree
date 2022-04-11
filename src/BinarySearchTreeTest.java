import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @org.junit.jupiter.api.Test
    void insert() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(9);
        tree.insert(12);
        tree.insert(13);
        tree.insert(4);
        System.out.println(tree.inOrderTraversal());
    }

    @org.junit.jupiter.api.Test
    void delete() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(9);
        tree.insert(12);
        tree.insert(13);
        tree.insert(4);

        tree.delete(20);
        System.out.println(tree.inOrderTraversal());
    }

    @Test
    void contains() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(9);
        tree.insert(12);
        tree.insert(13);
        tree.insert(4);
        System.out.print(tree.contains(9));
    }
}