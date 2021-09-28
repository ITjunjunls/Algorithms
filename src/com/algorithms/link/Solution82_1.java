package com.algorithms.link;

import java.util.HashMap;
import java.util.Map;

/**
 * @author itjunjun  2021/9/23 9:06
 */
public class Solution82_1 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        Map<Integer, Integer> map = new HashMap<>();
        ListNode dummyNode = new ListNode(), left, right;
        dummyNode.next = head;
        left = dummyNode;
        right = dummyNode.next;
        while (right != null) {
            if (map.containsKey(right.val)) {
                while(right.val == right.next.val){
                    right = right.next;
                }
                left.next = right.next;
                left = right.next;
                right = right.next;
            } else {
                map.put(right.val, 1);
                if(right.next != null){
                    if(right.val != right.next.val){
                        left.next = right;
                    }
                }
                right = right.next;
            }
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4, 4, 5};
        ListNode head = TestCase.initList(a);
        Solution82_1 solution82_1 = new Solution82_1();
        head = solution82_1.deleteDuplicates(head);
        TestCase.display(head);
    }
}
