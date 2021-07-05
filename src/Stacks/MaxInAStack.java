package Stacks;

import java.util.Stack;

// The aim is to design an algorithm that can return the maximum iterm of a
// stack in O(1) running time complexity. We can use O(n) extra memory!
// Hint: we can use another stack to track the max item
public class MaxInAStack {

    // the problem is that we have a stack and we want to track the largest item during insertion
    // - so we want to make sure the getMax() operation has O(1) running time
    // - the memory complexity can be O(n) which means we can use another stack in the implementation

    public static void main(String[] args) {
        Stack<Integer> initial = new Stack<>();
        initial.push(1);
        initial.push(2);
        initial.push(10);
        initial.push(1);
        initial.push(8);

        System.out.println(findMax(initial));
    }

    public static int findMax(Stack<Integer> stack) {
        Stack<Integer> largest = new Stack<>();

        while(!stack.isEmpty()) {
            int val = stack.pop();
            if(largest.isEmpty()) {
                largest.push(val);
            } else {
                if(largest.peek() > val){
                    // do nothing
                }else {
                    largest.push(val);
                }
            }
        }

        return largest.pop();

    }

}
