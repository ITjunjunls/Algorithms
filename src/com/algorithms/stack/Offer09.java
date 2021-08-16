package com.algorithms.stack;

import java.util.Stack;

/**
 * @author itjunjun  2021/8/16 9:55
 */
public class Offer09 {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Offer09() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }else if(!stack1.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
        return -1;
    }

    public static void main(String[] args) {
        Offer09 offer09 = new Offer09();
        offer09.appendTail(1);
    }
}
