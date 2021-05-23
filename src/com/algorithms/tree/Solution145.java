package com.algorithms.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author itjunjun  2021/5/23 20:45
 */
public class Solution145 {

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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        posOrder(root, list);
        return list;
    }

    private void posOrder(TreeNode root, List<Integer> list) {
        if(root == null){
            return;
        }
        posOrder(root.left,list);
        posOrder(root.right,list);
        list.add(root.val);
    }

    public static void main(String[] args) {

    }
}
