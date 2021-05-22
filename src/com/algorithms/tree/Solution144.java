package com.algorithms.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author itjunjun  2021/5/22 9:40
 */
public class Solution144 {

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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root,list);
        return list;
    }

    private void preOrder(TreeNode root,List<Integer> list) {
        if(root == null){
            return ;
        }
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
}
