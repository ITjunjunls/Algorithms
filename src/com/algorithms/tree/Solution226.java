package com.algorithms.tree;

import javax.swing.tree.TreeNode;

/**
 * @author itjunjun  2021/5/18 21:22
 */
public class Solution226 {
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

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public TreeNode buildTree(int[] treeData, int n) {
        if (treeData.length == 0) {
            return null;
        } else {
            if (n < treeData.length) {
                int l = n * 2 + 1;
                int r = n * 2 + 2;

                TreeNode TreeRoot = new TreeNode(treeData[n], buildTree(treeData, l), buildTree(treeData, r));

                return TreeRoot;
            } else {
                return null;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 7, 1, 3, 6, 9};
        Solution226 solution226 = new Solution226();
        TreeNode t = solution226.buildTree(a, 0);
        solution226.invertTree(t);
    }
}
