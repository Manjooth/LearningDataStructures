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
    }

}
