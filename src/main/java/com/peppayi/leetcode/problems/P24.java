package com.peppayi.leetcode.problems;

import com.peppayi.leetcode.ListNode;

public class P24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode prev = sentinel;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            ListNode second = curr.next;
            ListNode next = second.next;

            prev.next = second;

            second.next = curr;
            curr.next = next;
            prev = curr;
            curr = next;
        }

        return sentinel.next;
    }
}
