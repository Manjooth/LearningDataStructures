package BinarySearchTree;

public class CompareTreeApp {

    private static BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
    private static BinarySearchTree<Integer> bst2 = new BinarySearchTree<Integer>();
    private static CompareBinaryTrees compare = new CompareBinaryTrees();

    public static void main(String[] args) {
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(14);
        bst.insert(16);
        bst.insert(-1);

        bst2.insert(10);
        bst2.insert(5);
        bst2.insert(15);
        bst2.insert(14);
        bst2.insert(16);
        bst2.insert(-1);

        System.out.println(compare.compareTrees(bst.getRoot(), bst2.getRoot()));

    }

}
