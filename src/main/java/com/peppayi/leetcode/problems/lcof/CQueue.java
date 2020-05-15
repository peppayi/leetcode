package com.peppayi.leetcode.problems.lcof;

import java.util.Stack;

public class CQueue {

    Stack<Integer> in;

    Stack<Integer> out;

    public CQueue() {
        this.in = new Stack<>();
        this.out = new Stack<>();
    }

    public void appendTail(int value) {
        in.push(value);
    }

    public int deleteHead() {
        if (out.isEmpty()) {
            while (! in.isEmpty()) {
                int v = in.pop();
                out.push(v);
            }
        }

        if (out.isEmpty()) {
            return -1;
        }
        else {
            return out.pop();
        }
    }
}
