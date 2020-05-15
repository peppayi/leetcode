package com.peppayi.leetcode.problems.lcof;

import com.peppayi.leetcode.TreeNode;

public class P07 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) return null;

        assert preorder.length == inorder.length;
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int pi, int pe, int[] inorder, int ii, int ie) {
        if (pi > pe || ii > ie) return null;
        else if (pi == pe) return new TreeNode(preorder[pi]);

        int rootValue = preorder[pi];
        int leftCount = 0;
        while (ii + leftCount <= ie && inorder[ii + leftCount] != rootValue) {
            leftCount++;
        }

        TreeNode root = new TreeNode(rootValue);
        root.left = buildTree(preorder, pi + 1, pi + leftCount, inorder, ii, ii + leftCount - 1);
        root.right = buildTree(preorder, pi + leftCount + 1, pe, inorder, ii + leftCount + 1, pe);

        return root;
    }
}
