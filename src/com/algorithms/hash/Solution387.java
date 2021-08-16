package com.algorithms.hash;

import java.util.HashMap;

/**
 * @author itjunjun  2021/6/22 21:12
 */
public class Solution387 {
//    public int firstUniqChar(String s) {
//        char[] str = s.toCharArray();
//        HashMap<Character, Integer> hashMap = new HashMap();
//        for (int i = 0; i < str.length; i++) {
//            if (hashMap.containsKey(str[i])) {
//                hashMap.put(str[i], hashMap.get(str[i]) + 1);
//            } else {
//                hashMap.put(str[i], 0);
//            }
//        }
//        for(int i=0;i<str.length;i++){
//            if(hashMap.get(str[i]) == 0){
//                return i;
//            }
//        }
//        return -1;
//    }

    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution387 solution387 = new Solution387();
        int i = solution387.firstUniqChar("leetcode");
        System.out.println(i);
    }
}
