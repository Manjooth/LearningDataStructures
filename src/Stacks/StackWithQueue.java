package Stacks;

import java.util.Stack;

// the aim is to design a queue abstract data type with the help of stacks
public class StackWithQueue {
    private static Stack<Integer> enqueueStack = new Stack<>();
    private static Stack<Integer> dequeueStack = new Stack<>();
    // stack for recursion
    private static Stack<Integer> stack = new Stack<>();
    // the problem is that we want to implement queue abstract data type with
    // the enqueue() and dequeue() operations with stacks
    // - we can use 2 stacks to solve this problem
    // - one stack for enqueue() operation
    // - one stack for the dequeue() operation
    public static void main(String[] args) {
        enqueue(10);
        enqueue(5);
        enqueue(3);

        System.out.println(dequeue());

        enqueue(100);
        enqueue(3);

        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());
    }

    public static void enqueue(int item) {
        enqueueStack.push(item);
    }

    public static int dequeue(){
        // no items in the stacks
        if(enqueueStack.isEmpty() && dequeueStack.isEmpty()) {
            throw new RuntimeException("Stacks are empty");
        }

        // if the dequeueStack is empty we have to add items O(n) time
        if(dequeueStack.isEmpty()){
            while(!enqueueStack.isEmpty()){
                dequeueStack.push(enqueueStack.pop());
            }
        }

        return dequeueStack.pop();
    }

    // NOTE: we use 2 stacks again but instead of explicitly defining the second stack
    // we use the call-stack of program (stack memory or execution stack)
    public static int recursiveDeque(){
        // base case for the recursive method calls the first item
        // is what we are after (this is what we need for queue's dequeue operation)
        if(stack.size() == 1){
            return stack.pop();
        }

        // we keep popping the items until we find the last one
        int item = stack.pop();

        // we call the method recursively
        int lastDequeuedItem = recursiveDeque();

        // after we find the item we dequeue, we have to re-insert the items one by one
        enqueue(item); // would change method to push to stack

        // this is the item we are looking for (this is what has been popped of in the
        // stack.size() == 1) section
        return lastDequeuedItem;
    }

}
