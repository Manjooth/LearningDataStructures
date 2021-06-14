package LinkedLists;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    // the first node
    private Node<T> head;
    private int numOfItems;

    @Override
    public void insert(T data) {
        if(head == null){
            // we know this is going to be the first node
            head = new Node<>(data);
        }else{
            // we know that this is not the first node but the next item in the linked list
            // insert data at the beginning of the list
            insertBeginning(data);
            // insert data at the end of the list
            // insertEnd(data, head);
        }
        numOfItems++;
    }

    // because we have to start with the root node, we have to first find the last node in O(N)
    private void insertEnd(T data, Node<T> node) {
        if(node.getNextNode() != null){
            insertEnd(data, node.getNextNode());
        }else{
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    // we just have to update the references O(1)
    private void insertBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(head);
        head = newNode;
    }

    @Override
    public void remove(T data) {
        if(head == null){
            return;
        }

        // if we want to remove the first node
        if(head.getData().compareTo(data) == 0){
            head = head.getNextNode();
        }else{
            // find node that contain the data and remove it
            removeData(data, head, head.getNextNode());
        }
    }

    private void removeData(T data, Node<T> node, Node<T> nextNode) {
        // we have to find the node we want to remove
        while(node != null){
            // this is the node we want to remove
            if(nextNode.getData().compareTo(data) == 0){
                // 1-2-3 goes to 1-3
                numOfItems--;
                node.setNextNode(nextNode.getNextNode());
                nextNode = null;
                return;
            }
            node = nextNode;
            nextNode = nextNode.getNextNode();
        }
    }

    @Override
    public void traverse() {
        if(head == null){
            return;
        }else{
            Node<T> currentNode = head;
            while(currentNode != null){
                System.out.println(currentNode.toString());
                currentNode = currentNode.getNextNode();
            }
        }
    }

    @Override
    public int size() {
        return numOfItems;
    }
}
