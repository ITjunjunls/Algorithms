package com.algorithms.link;

/**
 * @author itjunjun  2021/9/17 17:55
 */
public class Solution234_1 {

    public boolean isPalindrome(ListNode head) {
        ListNode reversedList = createList(head);
        while (reversedList != null) {
            if (reversedList.val == head.val) {
                reversedList = reversedList.next;
                head = head.next;
            } else {
                return false;
            }
        }
        return true;
    }

    private ListNode createList(ListNode head) {
        ListNode newHead = new ListNode();
        newHead.val = head.val;
        ListNode temp = head.next,end = newHead;
        while(temp != null){
            ListNode node = new ListNode();
            node.val = temp.val;
            end.next = node;
            end = node;
            temp = temp.next;
        }
        end.next = null;
        newHead = reverse(newHead);
        return newHead;
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

    void diaplay(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "    ");
            head = head.next;
        }
        System.out.println(" ");
    }

    ListNode reverse(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

}
