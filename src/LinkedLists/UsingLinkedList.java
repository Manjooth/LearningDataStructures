package LinkedLists;

public class UsingLinkedList {

    public static void main(String[] args) {
        LinkedList<String> users = new LinkedList<>();
        users.insert("Manny");
        users.insert("Joey");
        users.insert("Lucy");
        users.insert("Adam");
        users.insert("Penny");

        users.traverse();
        users.remove("Adam");
        System.out.println("---------------------");
        users.traverse();
        System.out.println("---------------------");

        LinkedList<Person> people = new LinkedList<>();
        Person p = new Person("Judy", 22);
        people.insert(p);
        people.insert(new Person("Mario", 192));
        people.insert(new Person("Luigi", 182));
        people.insert(new Person("Jenny", 28));

        people.traverse();
        System.out.println("---------------------");
        people.remove(new Person("Mario", 192));
        people.traverse();
        System.out.println("---------------------");
    }
}
