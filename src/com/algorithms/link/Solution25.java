package com.algorithms.link;

/**
 * @author itjunjun  2021/9/16 10:10
 */
public class Solution25 {

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

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode a = head, b = head;
        for (int i = 0; i < k; i++) {
            if(b == null){
                return head;
            }
            b = b.next;
        }
        ListNode newHead = reverse(a,b);
        a.next = reverseKGroup(b,k);
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

    void diaplay(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "   ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Solution25 solution25 = new Solution25();
        ListNode head = solution25.initList();
        ListNode end = head;
        while (end != null) {
            if (end.next != null) {
                end = end.next;
            } else {
                break;
            }
        }
        head = solution25.reverseKGroup(head,2);
        solution25.diaplay(head);
    }
}
