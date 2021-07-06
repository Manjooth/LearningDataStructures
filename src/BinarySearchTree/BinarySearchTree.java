package BinarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>{

    private Node<T> root;

    @Override
    public void insert(T data) {
        // this is when we insert the first node into the BST (parent is null)
        if(root == null){
            root = new Node<T>(data, null);
        } else{
            // there are already items in the BST
            insert(data, root);
        }

    }

    private void insert(T data, Node<T> node) {
        // this is when the data is SMALLER than the value in the node
        // GO TO THE LEFT SUBTREE
        if(root.getData().compareTo(node.getData()) > 0){
            // there is a valid left child so we go there
            if(node.getLeftChild() != null){
                insert(data, node.getLeftChild());
            }else{
                // the left child is null so we create a left child
                node.setLeftChild(new Node<T>(data, node));
            }
        }else {
            // this is when the data is GREATER than the value in the node
            // GO TO THE RIGHT SUBTREE
            if(node.getRightChild() != null){
                insert(data, node.getRightChild());
            }else{
                // the right child is null so we create a right child
                node.setRightChild(new Node<T>(data, node));
            }
        }
    }

    @Override
    public void remove(T data) {

    }

    @Override
    public void traversal() {

    }

    @Override
    public T getMin() {
        // the max item is the leftmost item in the tree
        if(root == null){
            return null;
        }

        return getMin(root);
    }

    private T getMin(Node<T> node) {
        if(node.getLeftChild() != null){
            return getMax(node.getLeftChild());
        }
        return node.getData();
    }

    @Override
    public T getMax() {
        // the max item is the rightmost item in the tree
        if(root == null){
            return null;
        }

        return getMax(root);
    }

    private T getMax(Node<T> node) {
        if(node.getRightChild() != null){
            return getMax(node.getRightChild());
        }
        return node.getData();
    }
}
