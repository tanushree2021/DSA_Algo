package leetcode.top150;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element
 * appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 *
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums
 * initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 *
 * Example 1:
 *
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 * Example 2:
 *
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] nums = {1,1,2};
        getK(nums);

        nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        getK(nums);


    }

    private static void getK(int[] nums) {
        System.out.println("Input");
        Util.display(nums);
        int k = removeDuplicates(nums); // Calls your implementation
        Util.display(nums);
        System.out.println("Result k =" +k);
        System.out.println("============================");
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
//        int d = 0;
        int l = nums.length;
        int count;
        Map<Integer, Integer> duplicateMap = new LinkedHashMap<>();
        for(int no: nums){
            if(duplicateMap.containsKey(no)) {
                count = duplicateMap.get(no);
                duplicateMap.put(no,count+1);
            } else {
                duplicateMap.put(no, 1);
            }
        }
        for(int n: duplicateMap.keySet()){
            nums[i] = n;
            i++;
        }
        return duplicateMap.size();
    }
}
