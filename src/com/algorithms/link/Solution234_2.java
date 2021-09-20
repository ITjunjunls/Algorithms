package com.algorithms.link;

/**
 * @author itjunjun  2021/9/17 17:54
 */
public class Solution234_2 {

    ListNode left;

    public boolean isPalindrome(ListNode head) {
        left = head;
        return check(head);
    }

    boolean check(ListNode right) {
        if (right == null) {
            return true;
        }
        boolean res = check(right.next);
        res = (res && (left.val == right.val));
        left = left.next;
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        Solution234_2 solution234_2 = new Solution234_2();
        ListNode head = TestCase.initList(a);
        System.out.println(solution234_2.isPalindrome(head));
    }
}
