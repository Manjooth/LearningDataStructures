package DoublyLinkedLists;

import java.util.LinkedList;

public class UsingDoublyLinkedList {

    public static void main(String[] args) {

        DoublyLinkedList<String> names = new DoublyLinkedList<>();
        names.insert("Adam");
        names.insert("Ana");
        names.insert("Billy");
        names.insert("Kendra");

        names.traverseForward();
        System.out.println("*******************");
        names.traverseBackword();
        System.out.println("*******************");

        LinkedList<String> dll = new LinkedList<>();
        dll.addFirst("Monica");
        dll.addFirst("Phoebe");
        dll.addFirst("Ross");

        dll.removeFirst();

//        dll.addLast("Monica");
//        dll.addLast("Phoebe");
//        dll.addLast("Ross");

//        dll.removeLast();

        for(String n : dll){
            System.out.println(n);
        }

    }

}
