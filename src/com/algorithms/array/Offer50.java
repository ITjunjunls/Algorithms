package com.algorithms.array;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author itjunjun  2021/8/20 12:12
 */
public class Offer50 {
    public char firstUniqChar(String s) {
        HashMap<Character, Integer> hs = new HashMap();
        char arr[] = s.toCharArray();
        if (s.length() == 0) {
            return ' ';
        }
        for (int i = 0; i < arr.length; i++) {
            if (hs.containsKey(arr[i])) {
                hs.put(arr[i], -1);
            } else {
                hs.put(arr[i], i);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(hs.get(arr[i]) == 1){
                return arr[i];
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        Offer50 offer50 = new Offer50();
        System.out.println(offer50.firstUniqChar(" "));
    }
}
