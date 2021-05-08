package com.algorithms.set;

import java.util.TreeSet;

/**
 * @author itjunjun  2021/4/29 10:06
 */
public class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        TreeSet<String> treeSet = new TreeSet<>();
        for(String word: words){
            StringBuilder res = new StringBuilder();
            for(int i=0;i<word.length();i++){
                res.append(codes[word.charAt(i)-'a']);
            }
            treeSet.add(res.toString());
        }
        return treeSet.size();
    }

    public static void main(String[] args) {

    }
}
