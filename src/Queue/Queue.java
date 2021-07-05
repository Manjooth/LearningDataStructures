package Queue;

public class Queue<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int count;

    public boolean isEmpty() {
        return firstNode == null;
    }

    public int size() {
        return count;
    }

    // O(1)
    public void enqueue(T data) {
        count++;
        Node<T> oldLastNode = lastNode;
        lastNode = new Node<>(data);
        lastNode.setNextNode(null);

        if(isEmpty()){
            firstNode = lastNode;
        }else {
            oldLastNode.setNextNode(lastNode);
        }
    }

    // O(1)
    public T dequeue() {
        count--;
        T dataToDequeue = firstNode.getData();
        firstNode = firstNode.getNextNode();

        if(isEmpty()){
            lastNode = null;
        }

        return dataToDequeue;
    }

}
