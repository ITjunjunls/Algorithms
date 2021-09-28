package com.algorithms.link;

/**
 * @author itjunjun  2021/9/22 16:31
 *61. 旋转链表
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 */
public class Solution61_1 {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode end = head;
        int len = 1;
        while (end.next != null) {
            end = end.next;
            len++;
        }
        end.next = head;
        k = k % len;
        for (int i = len; i > k + 1; i--) {
            head = head.next;
        }
        dummyNode.next = head.next;
        head.next = null;
        return dummyNode.next;
    }

    public static void main(String[] args) {
        Solution61_1 solution61_1 = new Solution61_1();
        int[] a = {0,1,2};
        ListNode head = TestCase.initList(a);
        head = solution61_1.rotateRight(head, 4);
        TestCase.display(head);
    }
}
