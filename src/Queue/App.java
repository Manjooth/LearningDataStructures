package Queue;

public class App {

    public static void main(String[] args) {
        Queue<Integer> numbers = new Queue<Integer>();
        numbers.enqueue(10);
        numbers.enqueue(100);
        numbers.enqueue(1000);

        System.out.println(numbers.size());
        System.out.println(numbers.dequeue());
        System.out.println(numbers.dequeue());
        System.out.println(numbers.dequeue());
    }

}
