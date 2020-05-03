package com.peppayi.leetcode.contest.c187;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class P3Test {

    @Test
    public void longestSubarray() {
        test(new int[]{8, 2, 4, 7}, 4, 2);
    }

    private void test(int[] nums, int limit, int longest) {
        int rv = new P3().longestSubarray(nums, limit);
        Assert.assertEquals(Arrays.toString(nums) + " and " + limit + " gets " + longest, longest, rv);
    }
}