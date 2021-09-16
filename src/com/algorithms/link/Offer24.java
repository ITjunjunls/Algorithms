package com.algorithms.link;

/**
 * @author itjunjun  2021/8/17 10:34
 */

public class Offer24 {

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        return reverse(head);
    }

    public ListNode reverse(ListNode head){
        if(head.next == null){
            return head;
        }
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    void diaplay(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
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
        Offer24 offer24 = new Offer24();
        offer24.diaplay(head);
        head = offer24.reverseList(head);
        while(head != null){
            System.out.println(head.val + "   ");
            head = head.next;
        }
    }
}
