package com.algorithms.link;

/**
 * @author itjunjun  2021/8/17 10:34
 */

public class Offer24 {

    public ListNode reverseList(ListNode head) {
        ListNode resHead = new ListNode(0);
        while (head != null) {
            ListNode node = new ListNode(0);
            node.val = head.val;
            node.next = resHead.next;
            resHead.next = node;
            head = head.next;
        }
        return resHead.next;
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
        head = offer24.reverseList(head);
        while(head != null){
            System.out.println(head.val + "   ");
            head = head.next;
        }
    }
}
