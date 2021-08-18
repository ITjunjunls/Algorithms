package com.algorithms.string;

/**
 * @author itjunjun  2021/8/18 9:30
 */
public class Offer05 {
    public String replaceSpace(String s) {
        int len = s.length();
        char str[] = new char[len];
        str = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if(' ' == str[i]){
                sb.append("%20");
            }else {
                sb.append(str[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Offer05 offer05 = new Offer05();
        System.out.println(offer05.replaceSpace("we are young"));
    }
}
