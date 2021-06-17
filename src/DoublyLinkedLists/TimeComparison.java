package DoublyLinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class TimeComparison {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        long now = System.currentTimeMillis();

        for(int i = 0; i < 500000; i++){
            // Time taken for the ArrayList: 9606
            // arrayList.add(0, i);
            // Time taken for the ArrayList: 11
            arrayList.add(i);
        }

        System.out.println("Time taken for the ArrayList: " + (System.currentTimeMillis() - now));

        LinkedList<Integer> linkedList = new LinkedList<>();

        now = System.currentTimeMillis();

        for(int i = 0; i < 500000; i++){
            // Time taken for the LinkedList: 9
            // linkedList.addFirst(i);
            // Time taken for the LinkedListS: 10
            linkedList.add(i);
        }

        System.out.println("Time taken for the LinkedList: " + (System.currentTimeMillis() - now));
    }

}
