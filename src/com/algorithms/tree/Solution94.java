package com.algorithms.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author itjunjun  2021/5/12 11:28
 */
public class Solution94 {
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


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTree(root, list);
        return list;
    }

    private void inorderTree(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorderTree(root.left, list);
        list.add(root.val);
        inorderTree(root.right, list);
    }
}
