package com.algorithms.link;

/**
 * @author itjunjun  2021/9/17 10:31
 */
public class Solution234 {

    public boolean isPalindrome(ListNode head) {
        ListNode newHead = new ListNode(0, null);
        ListNode temp = head;
        while (temp != null) {
            ListNode node = new ListNode();
            node.val = temp.val;
            node.next = newHead.next;
            newHead.next = node;
            temp = temp.next;
        }
        newHead = newHead.next;
        while (head != null) {
            if (head.val == newHead.val) {
                head = head.next;
                newHead = newHead.next;
            } else {
                return false;
            }
        }
        return true;
    }

    void diaplay(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "    ");
            head = head.next;
        }
        System.out.println(" ");
    }

    ListNode initList() {
        int[] a = {1, 2, 3, 2, 1};
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
        Solution234 solution234 = new Solution234();
        ListNode head = solution234.initList();
        System.out.println(solution234.isPalindrome(head));
    }
}
