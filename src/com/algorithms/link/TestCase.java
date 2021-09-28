package com.algorithms.link;

/**
 * @author itjunjun  2021/9/18 19:12
 */
public class TestCase {

    static public void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "   ");
            head = head.next;
        }
    }

    static public ListNode initList(int[] array) {
        int[] a = array;
        ListNode head = new ListNode(a[0]);
        ListNode end = head;
        for (int i = 1; i < a.length; i++) {
            ListNode node = new ListNode(a[i]);
            end.next = node;
            end = node;
        }
        end.next = null;
        return head;
    }
}
