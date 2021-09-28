package com.algorithms.link;

/**
 * @author itjunjun  2021/9/25 11:00
 */
public class Solution83 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode left, right;
        right = head.next;
        left = head;
        while (right != null) {
            if (right.val == left.val) {
                left.next = right.next;
                right.next = null;
                right = left.next;
            } else {
                left = left.next;
                right = right.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 3};
        ListNode head = TestCase.initList(a);
        Solution83 solution83 = new Solution83();
        head = solution83.deleteDuplicates(head);
        TestCase.display(head);
    }

}
