package com.algorithms.stack;

import java.util.Stack;

/**
 * @author itjunjun  2021/4/20 9:56
 */
public class strStr28 {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 0){
            return -1;
        }
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        for (int i = 0; i + n.length <= h.length; i++) {
            boolean flag = true;
            for (int j = 0; j < n.length; j++) {
                if (h[i + j] != n[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        strStr28 s = new strStr28();
        int res = s.strStr("a", "a");
        System.out.println(res);
    }
}
