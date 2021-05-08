package com.algorithms.link;

/**
 * @author itjunjun  2021/4/22 9:42
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("");
        }
        this.val = array[0];
        ListNode cur = this;
        for (int i = 0; i < array.length; i++) {
            cur.next = new ListNode(array[i]);
            cur = cur.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            res.append(cur.val + "->");
            cur = cur.next;
        }
        res.append("null");
        return res.toString();
    }
}