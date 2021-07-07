package BinarySearchTree;

public interface Tree<T extends Comparable<T>> {
    public void insert(T data);
    // this is the most complicated operation
    public void remove(T data);
    // in-order traversal yields the natural ordering
    public void traversal();
    public T getMin();
    public T getMax();
    public Node<T> getRoot();
    public Node<T> getSmallest(Node<T> node, int k);
    public int getAgesSum();
}
