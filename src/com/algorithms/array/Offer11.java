package com.algorithms.array;

/**
 * @author itjunjun  2021/8/20 12:03
 */
public class Offer11 {
    public int minArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return numbers[i + 1];
            }
        }
        return numbers[0];
    }
}
