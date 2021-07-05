package Stacks;

public class App {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Hello");
        stack.push("World");
        stack.push("!");
        stack.push("Adam");
        stack.push("Julie");

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}
