package com.algorithms.tree;

import javax.swing.tree.TreeNode;

/**
 * @author itjunjun  2021/5/17 10:09
 */
public class Solution112 {
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

    /*public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }*/

    public boolean hasPathSum(TreeNode root, int targetSum) {
        int currentSum = 0;
        return pathSum(root,targetSum,currentSum);
    }

    private boolean pathSum(TreeNode root, int targetSum,int currentSum){
        if(root == null){
            return false;
        }
        if(root.left != null || root.right != null){
            currentSum = currentSum + root.val;
        }else {
            if((currentSum + root.val) == targetSum){
                return true;
            }
        }
        if(pathSum(root.left,targetSum,currentSum)){
            return true;
        }
        if(pathSum(root.right,targetSum,currentSum)){
            return true;
        }else {
            return false;
        }
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
        Solution112 solution112 = new Solution112();
        int[] treeData = {5, 4, 8, 11, 0, 13, 4, 7, 2, 0, 0, 0, 1};
        TreeNode treeNode = solution112.buildTree(treeData, 0);
        System.out.println(solution112.hasPathSum(treeNode, 22));
    }
}