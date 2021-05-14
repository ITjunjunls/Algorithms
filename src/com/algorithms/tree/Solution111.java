package com.algorithms.tree;

/**
 * @author itjunjun  2021/5/14 10:32
 */
public class Solution111 {
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

    public int minDepth(TreeNode root) {
        int i = 1;
        minDepth(root, i);
        return 0;
    }

    private int minDepth(TreeNode root, int i) {
        if (root == null) {
            return 0;
        }
        i++;
        return Math.min(minDepth(root.left, i), minDepth(root.right, i));
    }

    /*public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if(root.left!=null & root.right !=null){
            return Math.min(minDepth(root.left) + 1, minDepth(root.right) + 1);
        }
        if(root.left!=null || root.right!=null){
            return Math.max(minDepth(root.left) + 1, minDepth(root.right) + 1);
        }
        return 0;
    }*/

    /**
     *                                        2
     *                                            3
     *                                               4
     *                                                 5
     *                                                   6
     *
     */
}
