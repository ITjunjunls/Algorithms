package com.algorithms.tree;

/**
 * @author itjunjun  2021/5/13 10:41
 */
public class Solution101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (isSymmetric(root.left, root.right)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null && right != null || left != null && right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        if (!isSymmetric(left.right, right.left)) {
            return false;
        }
        if (!isSymmetric(left.left, right.right)) {
            return false;
        }
        return true;
    }


}
