package com.algorithms.array;

/**
 * @author itjunjun  2021/5/10 11:28
 */
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        /*int left = 0, right = nums.length - 1, mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return mid+1;*/
        for (int i = 0; i < nums.length; i++) {
            if(target == nums[i]){
                return i;
            }
            if(target > nums[i]){
                continue;
            }
            if(target < nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        Solution35 solution35 = new Solution35();
        System.out.println(solution35.searchInsert(nums, 5));
    }
}
