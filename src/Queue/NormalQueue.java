package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class NormalQueue {

    public static void main(String[] args) {
        // we process the items in a FIFO order
        Queue<Integer> queue = new LinkedList<>();

        // add() inserts a new item into the queue in O(1)
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // element() returns without removing the first item
        System.out.println(queue.element());
        System.out.println(queue.size());

        // remove() method is a dequeue() method in O(1)
        while(!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

}
