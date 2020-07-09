package com.peppayi.leetcode.problems;

import com.peppayi.leetcode.ListNode;

public class P019 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) return head;

        int c = 0;
        ListNode r = head;
        while (r != null && c < n) {
            r = r.next;
            c++;
        }

        if (c < n) return head;

        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode l = head;
        ListNode prev = sentinel;
        while (r != null) {
            r = r.next;
            prev = l;
            l = l.next;
        }

        prev.next = l.next;
        l.next = null;  // help GC

        return sentinel.next;
    }
}
