package leetcode.top150;

import java.util.Collections;

/**
 * https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the
 * array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote
 * the elements that should be merged, and the last n elements are set to 0 and should be ignored.
 *  nums2 has a length of n.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        mergeSortedArrayResult(arr1,  3, arr2,3);
        arr1 = new int[]{1};
        arr2 = new int[]{};
        mergeSortedArrayResult(arr1, 1, arr2, 0);
        arr1 = new int[]{0};
        arr2 = new int[]{1};
        mergeSortedArrayResult(arr1, 0, arr2, 1);
    }

    private static void mergeSortedArrayResult(int[] arr1,  int m, int[] arr2, int n) {
        System.out.println("Given Inputs");
        Util.display(arr1);
        Util.display(arr2);
        int[] result = mergeSortedArrayBasic(arr1, m, arr2, n);
        System.out.println("\nresult");
        Util.display(result);
        System.out.println("===================================");
    }


    private static int[] mergeSortedArrayBasic(int[] nums1, int m, int[] nums2, int n) {
        int i, j=0, k, temp;
        int len1 = nums1.length;
        if (m >= 0 && n> 0 && len1 == (m + n)) {
            for (i = m; i < len1 && j < n; i++, j++) {
                nums1[i] = nums2[j];
            }
            int pivot = 0;
            while (pivot < len1){
                for (k=0; k < len1; k++) {    //1, 2, 3, 2, 5, 6
                  //  System.out.println("k="+k +", pivot="+pivot);
                    if(nums1[k] > nums1[pivot]) {
                        /*temp = nums1[pivot];
                        nums1[pivot] = nums1[k];
                        nums1[k] = temp;*/

                        Util.swap(nums1, k, pivot);
                    }
                }
                pivot++;
            }
        }
        return nums1;
    }


//    private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
//
//        int i, j, temp;
//        int m=3, n=3;
//        for(i = 0, j=0; i<arr1.length && j<arr2.length; i++, j++)
//        {
//            if(arr2[j] < arr1[i]) {
//                temp = arr1[i];
//                arr1[i] = arr2[j];
//                pushBackward(arr1,m,temp, i+1);
//            }
//        }
//    }
//
//    private static void pushBackward(int[] arr1, int m, int temp, int i) {
//
//    }
}
