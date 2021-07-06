package BinarySearchTree;

public interface Tree<T> {
    public void insert(T data);
    // this is the most complicated operation
    public void remove(T data);
    // in-order traversal yields the natural ordering
    public void traversal();
    public T getMin();
    public T getMax();
}
