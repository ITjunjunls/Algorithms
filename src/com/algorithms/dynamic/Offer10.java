package com.algorithms.dynamic;

/**
 * @author itjunjun  2021/8/23 9:55
 */
public class Offer10 {
    public int fib(int n) {
        return cal(n);
    }

    public int cal(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return cal(n-2) + cal(n-1);
    }

    public static void main(String[] args) {
        Offer10 offer10 = new Offer10();
        System.out.println(offer10.fib(8));
    }
}
