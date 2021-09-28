package com.algorithms.link;

/**
 * @author itjunjun  2021/9/28 10:47
 *86. 分隔链表
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 *
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 */
public class Solution86 {

    public ListNode partition(ListNode head, int x) {
        if(head == null){
            return head;
        }
        ListNode newHead = new ListNode();
        ListNode end = newHead;
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode node = dummyNode;
        ListNode next;
        while(node.next != null){
            if(node.next.val < x){
                next = node.next;
                node.next = node.next.next;
                next.next = null;
                end.next = next;
                end = next;
            }else {
                node = node.next;
            }
        }
        end.next = dummyNode.next;
        return newHead.next;
    }

    public static void main(String[] args) {
        int[] a = {2,1};
        Solution86 solution86 = new Solution86();
        ListNode head = TestCase.initList(a);
        head = solution86.partition(head,2);
        TestCase.display(head);
    }

}
