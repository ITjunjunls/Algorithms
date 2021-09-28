package com.algorithms.link;

import java.util.HashMap;
import java.util.Map;

/**
 * @author itjunjun  2021/9/23 8:22
 * 82. 删除排序链表中的重复元素 II
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
 *
 * 返回同样按升序排列的结果链表。
 *
 */
public class Solution82 {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        Map<Integer,Integer> map = new HashMap<>();
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode node = dummyNode.next;
        while(node != null){
            if(map.containsKey(node.val)){
                map.put(node.val,map.get(node.val) + 1);
            }else {
                map.put(node.val,1);
            }
            node = node.next;
        }
        node = dummyNode;
        while(node.next != null){
            if(map.get(node.next.val) > 1){
                node.next = node.next.next;
            }else {
                node = node.next;
            }
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        int[] a = {1,1,1,2,3};
        ListNode head = TestCase.initList(a);
        Solution82 solution82 = new Solution82();
        head = solution82.deleteDuplicates(head);
        TestCase.display(head);
    }

}
