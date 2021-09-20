package com.algorithms.link;

import java.util.ArrayList;
import java.util.List;

/**
 * @author itjunjun  2021/9/20 8:39
 * 23. 合并K个升序链表
 * 给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 */
public class Solution23 {

    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0) {
            return lists[0];
        }
        ListNode head = new ListNode();
        ListNode minHead = lists[0];

        for (int i = 0; i < lists.length; i++) {


        }


        return head;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 5};
        int[] b = {1, 3, 4};
        int[] c = {2, 6};
        ListNode aHead = TestCase.initList(a);
        ListNode bHead = TestCase.initList(b);
        ListNode cHead = TestCase.initList(c);
        ListNode[] lists = {aHead, bHead, cHead};
        Solution23 solution23 = new Solution23();
        solution23.mergeKLists(lists);
    }

}
