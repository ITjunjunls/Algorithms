package com.algorithms.stack;

import java.util.Stack;

/**
 * @author itjunjun  2021/4/23 11:19
 */
public class Solution682 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        int prev = 0, next = 0;
        int result = 0;
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("+")) {
                prev = stack.pop();
                next = stack.pop();
                stack.push(next);
                stack.push(prev);
                result = prev + next;
                stack.push(result);
            } else if (ops[i].equals("D")) {
                prev = stack.peek();
                stack.push(2 * prev);
            } else if (ops[i].equals("C")) {
                stack.pop();
            } else {
                prev = Integer.parseInt(ops[i]);
                stack.push(prev);
            }
        }
        result = 0;
        int len = stack.size();
        for (int j = 0; j < len; j++) {
            result = result + stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String[] s = {"5","2","C","D","+"};
        Solution682 solution682 = new Solution682();
        System.out.println(solution682.calPoints(s));
    }
}
