package com.algorithms.link;

/**
 * @author itjunjun  2021/8/17 10:34
 */
public class Offer06 {
    public int[] reversePrint(ListNode head) {
        int len = 0;
        ListNode node = head;
        while(node != null){
            len++;
            node = node.next;
        }
        node = head;
        int a[] = new int[len];
        for(int i =len-1;i>=0;i--){
            a[i] = node.val;
            node = node.next;
        }
        return a;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode end = head;
        for (int i = 0; i < 3; i++) {
            ListNode node = new ListNode(i);
            end.next = node;
            end = node;
        }
        end.next = null;
        Offer06 offer06 = new Offer06();
        int a[] = offer06.reversePrint(head);
    }
}
