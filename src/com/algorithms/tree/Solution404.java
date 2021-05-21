package com.algorithms.tree;

/**
 * @author itjunjun  2021/5/21 9:57
 */
public class Solution404 {

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

    public int sumOfLeftLeaves(TreeNode root) {
        //左子树用0标记，右子树用1标记，如果一个点的左右子树都为null，label为0，那一定是左叶子节点
        return addFun(root, 1, 0);
    }

    private int addFun(TreeNode root, int label, int res) {
        if(root == null){
            return res;
        }
        if (root.left == null && root.right == null) {
            if (label == 0) {
                return root.val + res;
            } else {
                return res;
            }
        }
        res = addFun(root.left, 0, res);
        res = addFun(root.right, 1, res);
        return res;
    }
}
