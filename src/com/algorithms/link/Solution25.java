package com.algorithms.link;

/**
 * @author itjunjun  2021/9/16 10:10
 */
public class Solution25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode a = head, b = head;
        for (int i = 0; i < k; i++) {
            if (b == null) {
                return head;
            }
            b = b.next;
        }
        ListNode newHead = reverse(a, b);
        a.next = reverseKGroup(b, k);
        return newHead;
    }

    public ListNode reverse(ListNode head, ListNode last) {
        ListNode pre = null, cur = head, nxt = head;
        while (cur != last) {
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        Solution25 solution25 = new Solution25();
        ListNode head = TestCase.initList(a);
        ListNode end = head;
        while (end != null) {
            if (end.next != null) {
                end = end.next;
            } else {
                break;
            }
        }
        head = solution25.reverseKGroup(head, 2);
        TestCase.diaplay(head);
    }
}
