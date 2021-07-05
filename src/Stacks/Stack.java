package Stacks;

public class Stack<T> {
    // the LIFO is the last item we inserted, and is the first item we
    // take out when the pop() method is called
    private Node<T> head;
    private int count;

    // O(1)
    public void push(T data){
        Node<T> newNode = new Node<>(data);
        // this is when the linked list is empty
        if(head == null){
            head = newNode;
        } else {
            // the linked list already contains some items
            Node<T> oldHead = head;
            head = newNode;
            head.setNextNode(oldHead);
        }
        count++;

    }

    // removes the last item we have inserted O(1)
    public T pop() {
        if(isEmpty()){
            return null;
        }
        
        T item = head.getData();
        head = head.getNextNode();
        count--;
        return item;
    }

    // O(1)
    public int size() {
        return count;
    }

    // O(1)
    public boolean isEmpty() {
        return count == 0;
    }

}
