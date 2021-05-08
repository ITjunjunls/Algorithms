package com.algorithms.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author itjunjun  2021/4/18 17:16
 */
public class LeetCode {

    public static void main(String[] args) {
        String s1 = "{{}}(())[";
        String s2 = "{{}{}[()";
        String s3 = "[][]{{}}()()";
        LeetCode leetCode = new LeetCode();
        System.out.println(leetCode.isValid(s1));
        System.out.println(leetCode.isValid(s2));
        System.out.println(leetCode.isValid(s3));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (c == '{' && topChar != '}') {
                    return false;
                }
                if (c == '[' && topChar != ']') {
                    return false;
                }
                if (c == '(' && topChar != ')') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
