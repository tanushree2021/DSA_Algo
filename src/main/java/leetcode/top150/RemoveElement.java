package leetcode.top150;

/**
 * https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
 * <p>
 * Remove Element
 * <p>
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * <p>
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 2};
        int val = 3;
        input(nums, val);

        nums = new int[]{3,2,2,3}; // Check
        input(nums, val);

        nums = new int[]{2,3,3,2,2}; // Check
        input(nums, val);

        nums = new int[]{2,3,3,2};
        input(nums, val);

        nums = new int[]{3,2,2,2};
        input(nums, val);

        nums = new int[]{0,1,2,2,3,0,4,2};
        input(nums, 2);
    }

    private static void input(int[] nums, int val) {
        System.out.println("Given Input");
        Util.display(nums);
        int k = removeElementFromArr(nums, val);
        System.out.println("k = "+k);
        System.out.println("===============================");
    }

    //3,2,2,3   // 2,3,3,2,2 // 3,2,2,2
    private static int removeElementFromArr(int[] nums, int val) { // 3,2,2,3 // 2,3,3,2,2
        int i=0;
        int pivot=nums.length - 1;
        int k = 0;
        while (i< nums.length && i<pivot) { // 3
            if(nums[i] == val){
                if( nums[pivot] != val){
                    Util.swap(nums, i, pivot);
                    i++;
                }
                pivot--;
            } else {
                if( nums[pivot] == val){
                    pivot--;
                }
                i++;
            }

        }
        for(int no: nums){
            if(no == val){
                break;
            }
            k++;
        }
        System.out.println("Result");
        Util.display(nums);
        return k;
    }

}
