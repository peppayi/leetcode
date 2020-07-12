package com.peppayi.leetcode.problems;

import com.peppayi.leetcode.ListNode;

public class P24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode first = head, second = head.next;
        first.next = swapPairs(second.next);
        second.next = first;
        return second;
    }
}
