package com.algorithms.array;

/**
 * @author itjunjun  2021/5/27 15:32
 */
public class SolutionOffer64 {

    public int sumNums(int n) {
        return n == 1 ? 1 : n + sumNums(n - 1);
    }
}
