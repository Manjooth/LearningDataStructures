package BinarySearchTree;

public class App {

    private static BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();

    public static void main(String[] args) {
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(14);
        bst.insert(16);
        bst.insert(-1);

        System.out.println(bst.getMin());
        System.out.println(bst.getMax());
        bst.traversal();

        bst.remove(14); // 14 is a leaf node
        bst.remove(15); // 15 has a single right child
        bst.remove(5); // 5 has a single left child
        bst.remove(10); // 10 has 2 children nodes
        bst.traversal();
    }

}
