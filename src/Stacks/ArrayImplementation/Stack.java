package Stacks.ArrayImplementation;

public class Stack<T> {

    private T[] stack;
    private int count;

    public Stack() {
        stack = (T[]) new Object[1];
    }

    // we just have to add the new item to the end of the array O(1)
    public void push(T data){
        // ARRAYS ARE NOT DYNAMIC DATA STRUCTURES!!!
        // we have to resize the underlying array if necessary
        // if there are too many items: we double the size of the array
        // if there are too few items: then we decrease the array
        if(count == stack.length){
            resize(2*count);
        }

        // we just have to insert into the array
        stack[count++] = data;
    }

    // returns and removes the last item we have inserted O(1)
    public T pop(){
        if(isEmpty()){
            return null;
        }
        // need to decrement count first
        T item = stack[--count];
        // obsolete references - avoid memory leaks
        stack[count] = null;

        // maybe we have to resize the array and decrease the size
        // the stack is 25% full
        if(count > 0 && count == stack.length / 4){
            resize(stack.length / 2);
        }

        return item;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    // the size method in O(n)
    public int size(){
        return count;
    }

    // this is the bottleneck of the application, O(n)
    private void resize(int size) {
        T[] stackCopy = (T[]) new Object[size];

        // copy the items one by one
        for (int i = 0; i < count; i++) {
            stackCopy[i] = stack[i];
        }

        // update the references
        stack = stackCopy;
    }
}
