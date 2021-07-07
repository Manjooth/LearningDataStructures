package BinarySearchTree;
// Write an efficient algorithm thats able to compare 2 binary search trees. The method
// returns true are identical (same topology with same values in the nodes) otherwise
// it returns false
public class CompareBinaryTrees<T extends Comparable<T>> {

    // recursive implementation -  so have to define base cases
    public boolean compareTrees(Node<T> node1, Node<T> node2){
        // we have to check the base cases (it may be leaf node so we have to use ==)
        if(node1 == null || node2 == null){
            return node1 == node2;
        }

        // if the values within the nodes are not the same, we return false (trees are not the same)
        if(node1.getData().compareTo(node2.getData()) != 0) {
            return false;
        }

        // the left subtree values AND the right subtree values must match as well !!!
        return compareTrees(node1.getLeftChild(), node2.getLeftChild()) &&
                compareTrees(node1.getRightChild(), node2.getRightChild());
    }


}
