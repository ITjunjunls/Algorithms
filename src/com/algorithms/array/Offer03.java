package com.algorithms.array;

import java.util.HashMap;

/**
 * @author itjunjun  2021/8/19 10:04
 */
public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hs.containsKey(nums[i])) {
                return nums[i];
            } else {
                hs.put(nums[i], 0);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums[] = {3, 3, 4, 2, 0, 0, 1};
        Offer03 offer03 = new Offer03();
        System.out.println(offer03.findRepeatNumber(nums));
    }
}
