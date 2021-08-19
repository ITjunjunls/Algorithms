package com.algorithms.array;

/**
 * @author itjunjun  2021/8/19 10:54
 */
public class Offer53_2 {
    public int missingNumber(int[] nums) {
                int i = 0, j = nums.length - 1;
                while(i <= j) {
                    int m = (i + j) / 2;
                    if(nums[m] == m) {
                        i = m + 1;
                    }
                    else {
                        j = m - 1;
                    }
                }
                return i;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 3};
        Offer53_2 offer53_2 = new Offer53_2();
        System.out.println(offer53_2.missingNumber(arr));
    }
}
