package Stacks;

import java.util.Stack;

public class NormalStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // push O(1)
        stack.push("Adam");
        stack.push("Bill");
        stack.push("Claire");
        stack.push("Daniel");
        stack.push("Ella");

        // peek() runs in O(1) and returns the last item we inserted without removing it
        System.out.println(stack.peek());
        System.out.println(stack.size());

        // pop() runs in O(1), and removes the last item and returns it
        System.out.println(stack.pop());
        System.out.println(stack.size());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}
