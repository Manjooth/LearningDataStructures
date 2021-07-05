package Stacks.ArrayImplementation;

public class App {

    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();

        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        numbers.push(5);

        while(!numbers.isEmpty()){
            System.out.println(numbers.pop());
        }
    }

}
