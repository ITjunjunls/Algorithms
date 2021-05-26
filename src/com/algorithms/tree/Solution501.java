package com.algorithms.tree;

import java.util.HashMap;

/**
 * @author itjunjun  2021/5/24 9:40
 */
public class Solution501 {

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

    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        inOrder(root, hashMap);
        //这个题目有歧义啊，到底是频率最高的还是频率大于一就可以
        return  null;
    }

    private void inOrder(TreeNode root, HashMap<Integer, Integer> hashMap) {
        if (root == null) {
            return;
        }
        if (hashMap.containsKey(root.val)) {
            int i = hashMap.get(root.val);
            i++;
            hashMap.put(root.val, i);
        } else {
            hashMap.put(root.val, 1);
        }
        inOrder(root.left, hashMap);
        inOrder(root.right, hashMap);
    }
}
