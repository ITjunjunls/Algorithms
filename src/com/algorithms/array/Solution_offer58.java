package com.algorithms.array;

/**
 * @author itjunjun  2021/5/6 15:15
 */
public class Solution_offer58 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        sb = sb.append(s.substring(n,s.length()));
        sb = sb.append(s.substring(0,n));
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution_offer58 solution_offer58 = new Solution_offer58();
        System.out.println(solution_offer58.reverseLeftWords("abcdefg", 2));
    }
}
