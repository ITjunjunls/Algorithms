package com.algorithms.array;

/**
 * @author itjunjun  2021/5/8 10:36
 */
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int last = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                continue;
            }else {
                nums[last] = nums[i];
                last++;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Solution26 solution26 = new Solution26();
        int num = solution26.removeDuplicates(nums);
        System.out.println(num);
        // 0011122334
    }
}
