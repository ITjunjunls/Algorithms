package com.algorithms.stack;

import java.util.Stack;

/**
 * @author itjunjun  2021/8/16 9:55
 */
public class Offer30 {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;


    /** initialize your data structure here. */
    public Offer30() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if(stack2.isEmpty()){
            stack2.push(x);
        }else {
            if(stack2.peek() < x){
                stack2.push(stack2.peek());
            }else {
                stack2.push(x);
            }
        }
    }

    public void pop() {
        stack2.pop();
        stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
