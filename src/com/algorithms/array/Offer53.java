package com.algorithms.array;

/**
 * @author itjunjun  2021/8/19 10:34
 */
public class Offer53 {
    public int search(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                count++;
            }
        }
        return count;
    }
}
