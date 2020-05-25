package com.peppayi.leetcode.problems.lcof;

import com.peppayi.leetcode.ListNode;

public class P18 {

    public ListNode deleteNode(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode prev = sentinel;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
                break;
            }
            else {
                prev = curr;
                curr = curr.next;
            }
        }

        return sentinel.next;
    }
}
