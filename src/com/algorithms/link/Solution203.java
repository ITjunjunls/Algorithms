package com.algorithms.link;

/**
 * @author itjunjun  2021/4/22 9:41
 */
public class Solution203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.val != val) {
                prev = prev.next;
            }else {
                prev.next = prev.next.next;
            }
        }
        return dummyHead.next;
    }
}
