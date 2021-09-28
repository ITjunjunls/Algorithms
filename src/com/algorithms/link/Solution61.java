package com.algorithms.link;

/**
 * @author itjunjun  2021/9/22 15:12
 *61. 旋转链表
 *给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 */
public class Solution61 {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode end = head;
        int len = 0;
        while(end != null){
            end = end.next;
            len++;
        }
        k = k % len;
        for (int i = 0; i < k; i++) {
            end = dummyNode.next;
            while (end.next.next != null) {
                end = end.next;
            }
            end.next.next = dummyNode.next;
            dummyNode.next = end.next;
            end.next = null;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        Solution61 solution61 = new Solution61();
        int[] a = {1,2,3};
        ListNode head = TestCase.initList(a);
        head = solution61.rotateRight(head, 2000000);
        TestCase.display(head);
    }

}
