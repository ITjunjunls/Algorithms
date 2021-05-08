package com.algorithms.stack;

import java.util.Stack;

/**
 * @author itjunjun  2021/4/21 10:24
 */
public class MinStack155 {

    private Stack stack;


    /** initialize your data structure here. */
    public MinStack155() {
        stack = new Stack();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return (Integer)stack.peek();
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<stack.size();i++){
            if((Integer)stack.get(i)<min){
                min = (Integer) stack.get(i);
            }
        }
        return min;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
