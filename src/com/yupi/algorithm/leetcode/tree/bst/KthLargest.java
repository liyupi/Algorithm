package com.yupi.algorithm.leetcode.tree.bst;

/**
 * 功能描述：第k大数类
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class KthLargest {

    private MyTreeNode root;

    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        if (nums.length == 0){
            return;
        }
        this.root = new MyTreeNode(nums[0], 1);
        for (int i = 1; i < nums.length; i++) {
            insertIntoTree(root, nums[i]);
        }
    }

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 2, 1, 3, 6, 7, 8});
    }

    public MyTreeNode insertIntoTree(MyTreeNode root, int val) {
        if (this.root == null) {
            this.root = new MyTreeNode(val,1);
        }
        if (root == null) {
            return new MyTreeNode(val, 1);
        }
        if (root.val < val) {
            root.right = insertIntoTree(root.right, val);
            root.count++;
        } else if (root.val > val) {
            root.left = insertIntoTree(root.left, val);
            root.count++;
        }
        return root;
    }

    public int add(int val) {
        insertIntoTree(root, val);
        return search(root,k);
    }

    public int search(MyTreeNode root, int k) {
        if (root.right != null && root.right.count >= k) {
            return search(root.right, k);
        } else {
            int temp;
            if (root.right == null) {
                temp = k;
            } else {
                temp = k - root.right.count;
            }
            if (temp == 1) {
                return root.val;
            }
            return search(root.left, temp - 1);
        }
    }

    class MyTreeNode {
        public int val;
        public MyTreeNode left;
        public MyTreeNode right;
        int count;

        MyTreeNode(int val, int count) {
            this.val = val;
            this.count = count;
        }
    }
}