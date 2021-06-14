package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayLearning {

    public static void main(String[] args) {
        lookingAtArray();
        lookingAtArrayLists();
        sortArrayInPlace();
        reverseArrayInPlace();
    }

    public static void lookingAtArray(){
        // arrays are not dynamic data structures - we have to define the size in advance
        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++){
            nums[i] = i;
        }

        // random indexing: can use the indices of the array slots
        // O(1)
        nums[0] = 100;

        // if we don't know the index of the item we want to manipulate (search)
        // LINEAR SEARCH O(N) - if we do not know the index of what we're looking for
        for(int n : nums){
            System.out.println(n);
        }

        // if we ant to find the index of item 7
        for(int j = 0; j < nums.length; j++){
            if(nums[j] == 7){
                System.out.println("The index of item 7 is: " + j);
                break;
            }
        }
    }

    public static void lookingAtArrayLists(){
        // ArrayLists use standard arrays under the hood
        // capacity = 10

        List<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Kevin");
        names.add("Ana");
        names.add("Judith");

        // get size of array
        System.out.println(names.size());
        // to loop through
        for(String name : names){
            System.out.println(name);
        }

        // O(1)
        System.out.println(names.get(0));
        // O(N)
        names.remove(0);
        System.out.println(names.get(0));
    }

    public static void sortArrayInPlace(){
        /* The problem is that we want to reverse a T[] array in O(N) linear time
        complexity and we want the algorithm to be in-place as well - so the algorithm
        can not use additional memory!

        For example: input is [1,2,3,4,5] and the output is [5,4,3,2,1] */
        List<Integer> toSort = new ArrayList<>();
        toSort.add(5);
        toSort.add(4);
        toSort.add(3);
        toSort.add(2);
        toSort.add(1);

        for(int x : toSort){
            System.out.println(x);
        }

        System.out.println("***********************");

        // run through
        for(int i = 0; i < toSort.size() - 1; i++){
            // checking
            for(int j = 0; j < toSort.size() - 1; j++){
                int temp = toSort.get(j);
                int check = toSort.get(j+1);
                if(temp > check){
                    toSort.set(j, check);
                    toSort.set(j+1, temp);
                }
            }
        }

        for(int sorted : toSort){
            System.out.println(sorted);
        }
    }

    public static void reverseArrayInPlace(){
        int[] nums = {1,2,3,4,5};
        int startIndex = 0;
        int endIndex = nums.length - 1;

        while(endIndex > startIndex) {
            swap(nums, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }

        for(int n : nums){
            System.out.println(n);
        }
    }

    public static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
