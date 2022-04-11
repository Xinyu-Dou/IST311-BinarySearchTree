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
        System.out.println(tree.getOrderArray());
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

    @Test
    void rebalance() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);

        BinarySearchTree result = tree.rebalance();
        System.out.println(result.root);
        System.out.println(result.root.left);
        System.out.println(result.root.right);
    }
}