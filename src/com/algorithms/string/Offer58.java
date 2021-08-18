package com.algorithms.string;

/**
 * @author itjunjun  2021/8/18 9:41
 */
public class Offer58 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char ch[] = new char[s.length()];
        ch = s.toCharArray();
        for(int i = n;i<s.length();i++){
            sb.append(ch[i]);
        }
        for (int i = 0; i < n; i++) {
            sb.append(ch[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Offer58 offer58 = new Offer58();
        System.out.println(offer58.reverseLeftWords("asdfgh",2));
    }
}
