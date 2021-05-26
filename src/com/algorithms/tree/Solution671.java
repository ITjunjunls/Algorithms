package com.algorithms.tree;

import java.util.*;

/**
 * @author itjunjun  2021/5/25 15:18
 */
public class Solution671 {
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

    private int x = 0;

    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return -1;
        }
        find(root, list);
        Collections.sort(list);
        int temp = list.get(0);
        if(list.get(list.size()-1) == temp){
            return -1;
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i) != temp){
                return list.get(i);
            }
        }
        return 0;
    }

    private void find(TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            find(root.left, list);
            find(root.right, list);
        }
    }
}
