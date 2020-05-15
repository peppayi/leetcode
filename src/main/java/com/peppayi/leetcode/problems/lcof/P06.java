package com.peppayi.leetcode.problems.lcof;

import com.peppayi.leetcode.ListNode;

public class P06 {

    public int[] reversePrint(ListNode head) {
        if (head == null) return new int[0];

        int size = 0;
        ListNode ptr = head;
        while (ptr != null) {
            size++;
            ptr = ptr.next;
        }

        int[] rv = new int[size];
        int i = size - 1;
        ptr = head;
        while (ptr != null) {
            rv[i--] = ptr.val;
            ptr = ptr.next;
        }

        return rv;
    }
}
