package com.algorithms.tree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author itjunjun  2021/5/23 20:51
 */
public class BuildUtil {

    private static int i = 0;


    public static class TreeNode {
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

    private static void bildTree(int[] nums, TreeNode root) {
        if (i == nums.length) {
            return;
        }
        if (nums[i] == 0) {
            i++;
            return;
        }
        root.val = nums[i];
        i++;
        if(nums[i] == 0){
            return;
        }
        root.left = new TreeNode();
        root.right = new TreeNode();

        BuildUtil.bildTree(nums, root.left);
        BuildUtil.bildTree(nums, root.right);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 0, 3, 4, 6, 0, 0, 7, 0, 0, 5, 0, 0};
        TreeNode root = new TreeNode();
        BuildUtil.bildTree(nums, root);
        BuildUtil.levelOrder(root);
    }

    // 1 2 3 4 5 6 7 8 9
    // l l l l l l l l

    public static void levelOrder(TreeNode root) {
        int v= 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode cur = q.remove();
//            if(cur.val == 0){
//                v++;
//            }else {
//                System.out.println(cur.val);
//            }
            System.out.println(cur.val);
            if (cur.left != null) {
                q.add(cur.left);
            }
            if (cur.right != null) {
                q.add(cur.right);
            }
        }
    }
}
