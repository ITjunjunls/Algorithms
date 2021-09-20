package com.algorithms.link;

import sun.java2d.windows.GDIWindowSurfaceData;

/**
 * @author itjunjun  2021/9/15 8:54
 */
public class Solution92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode startNode = dummyNode;
        ListNode endNode;
        ListNode leftNode;
        ListNode rightNode;
        for (int i = 0; i < left - 1; i++) {
            startNode = startNode.next;
        }
        rightNode = startNode;
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }
        endNode = rightNode.next;
        leftNode = startNode.next;

        startNode.next = null;
        rightNode.next = null;

        startNode.next = reverse(leftNode);
        leftNode.next = endNode;
        return dummyNode.next;
    }

    ListNode reverse(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    public static void main(String[] args) {
        Solution92 solution92 = new Solution92();
        int[] a = {1, 2, 3, 4, 5};
        ListNode head = TestCase.initList(a);
        head = solution92.reverseBetween(head, 1, 3);
        TestCase.diaplay(head);
    }


}
