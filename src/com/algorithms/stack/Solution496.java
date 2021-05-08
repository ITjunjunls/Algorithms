package com.algorithms.stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author itjunjun  2021/4/25 11:02
 */
public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap map = new HashMap();
        Stack<Integer> stack = new Stack<Integer>();
        int[] res = new int[nums1.length];
        int temp = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (stack.size() == 0) {
                stack.push(nums2[i]);
            } else {
                temp = stack.peek();
                if (temp > nums2[i]) {
                    stack.push(nums2[i]);
                } else {
                    while (stack.size() > 0) {
                        temp = stack.peek();
                        if (temp < nums2[i]) {
                            map.put(temp, nums2[i]);
                            stack.pop();
                        } else {
                            break;
                        }
                    }
                    stack.push(nums2[i]);
                }
            }
        }
        while (stack.size() > 0) {
            map.put(stack.pop(), -1);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = (Integer) map.get(nums1[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 2, 4};
        int[] nums2 = {6, 5, 4, 3, 2, 1, 7};
        Solution496 solution496 = new Solution496();
        int[] res = solution496.nextGreaterElement(nums1, nums2);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + "  ");
        }
    }
}
