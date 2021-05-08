package com.algorithms.stack;

import java.util.Stack;

/**
 * @author itjunjun  2021/4/26 10:53
 */
public class Solution1021 {
    public String removeOuterParentheses(String S) {
        StringBuilder res = new StringBuilder();
        char[] arr = S.toCharArray();
        int level = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==')'){
                level--;
            }
            if(level>=1){
                res.append(arr[i]);
            }
            if(arr[i]=='('){
                level++;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution1021 solution1021 = new Solution1021();
        System.out.println(solution1021.removeOuterParentheses("(()(()))"));
    }


}
