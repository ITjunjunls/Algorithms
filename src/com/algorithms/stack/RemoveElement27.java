package com.algorithms.stack;

import java.util.Stack;

/**
 * @author itjunjun  2021/4/19 9:45
 */
public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        int num = 0;
        Stack stack = new Stack();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                stack.push(nums[i]);
                num++;
            }
        }
        for (int j = 0; j < num; j++) {
            nums[j] = (Integer) stack.peek();
            stack.pop();
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int l = new RemoveElement27().removeElement(nums, 2);
        System.out.println("返回的是" + l);
        for (int i = 0; i < l; i++) {
            System.out.println(nums[i]);
        }
    }
    /**
     * 0,1,2,2,3,0,4,2
     * 0 1 2 3 0 4 2 2
     *
     * 3 2 2 3
     * 2 2 3 3   1
     *
     */
}
