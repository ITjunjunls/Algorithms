package com.algorithms.link;

import sun.java2d.windows.GDIWindowSurfaceData;

/**
 * @author itjunjun  2021/9/15 8:54
 */
public class Solution92 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode startNode = dummyNode;
        ListNode endNode = head;
        ListNode leftNode = new ListNode();
        ListNode rightNode = new ListNode();
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

    void diaplay(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    ListNode initList() {
        int[] a = {1, 2, 3, 4, 5};
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

    public static void main(String[] args) {
        Solution92 solution92 = new Solution92();
        ListNode head = solution92.initList();
        head = solution92.reverseBetween(head, 2, 4);
        solution92.diaplay(head);
    }


}
