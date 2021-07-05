package LinkedLists;

import java.util.LinkedList;

// Suppose we have a standard linked list. Construct an in-place algorithm that's able to find the middle node.
public class FindMiddleNode {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Helen");
        names.add("James");
        names.add("Priti");
        names.add("Julia");
        names.add("Max");

        findMiddleNaive(names);
    }

    //private static void findMiddlePointers() {
        // we can use 2 pointers to get the middle node in O(N)
        // first pointer: traverse linked list one node at a time
        // second pointer: travers the linked list two nodes at a time
        // when the faster pointer reaches the end of the list then the slower pointer is pointing to the middle node
    //}

    public static void findMiddleNaive(LinkedList<String> list){
        // naive solution
        // count how many items and then / 2, if uneven / 2 + 1
        int size = list.size();
        int middle = -1;
        if(size % 2 == 0){
            size = (size / 2) - 1;
        }else {
            size = size / 2;
        }
        System.out.println(size);
        System.out.println(list.get(size));
    }

}
