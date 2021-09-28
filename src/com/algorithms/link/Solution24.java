package com.algorithms.link;

/**
 * @author itjunjun  2021/9/18 18:43
 * 24. 两两交换链表中的节点
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 */
public class Solution24 {

    public ListNode swapPairs(ListNode head) {
        head = reverse(head);
        return head;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head.next.next;
        ListNode right = head.next;
        right.next = head;
        head.next = reverse(node);
        return right;
    }

    public static void main(String[] args) {
        Solution24 solution24 = new Solution24();
        int a[] = {1, 2, 3, 4, 5};
        ListNode head = TestCase.initList(a);
        head = solution24.swapPairs(head);
        TestCase.display(head);
    }
}
