package BinarySearchTree;

public class KthSmallestApp {

    public static void main(String[] args) {
        Tree<Integer> bst = new BinarySearchTree<Integer>();

        bst.insert(2);
        bst.insert(55);
        bst.insert(67);
        bst.insert(12);
        bst.insert(11);

        System.out.println(bst.getSmallest(bst.getRoot(), 4));
        System.out.println(bst.getSmallest(bst.getRoot(), 1));
    }

}
