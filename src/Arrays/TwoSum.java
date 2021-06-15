package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
/*
Given an array of integers nums and an integer target, return indices of the two numbers
such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the
same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */
    public static void main(String[] args) {
        sum(new int[]{3, 2, 4}, 6);
        sum(new int[]{3, 3}, 6);
        sum(new int[]{2,7,11,15}, 9);
        sum(new int[]{1, 1, 1, 1, 5}, 6);
    }


    public static void sum(int[] arr, int target){
        int indexA = -1;
        int indexB = -1;

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                int sum = arr[i] + arr[j];
                if(sum == target){
                    indexA = i;
                    indexB = j;
                    break;
                }
            }
            if(indexA != -1 && indexB != -1){
                break;
            }
        }

        if(indexA != -1 && indexB != -1){
            System.out.println("[" + indexA + ", " + indexB + "]");
        }else{
            throw new IllegalArgumentException("No two sum solution");
        }
    }

    /*
    Following 2 are solutions from leetcode
    */
    public int[] twoSumTwoPassHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public int[] twoSumOnePassHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
