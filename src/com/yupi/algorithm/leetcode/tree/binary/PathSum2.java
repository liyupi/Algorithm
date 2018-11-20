package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：二叉树的路经总和
 * <p>
 * 思路：自顶向下递归即可
 */

public class PathSum2 {

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, new ArrayList<>(), sum);
        return res;
    }

    void dfs(TreeNode root, List<Integer> list, int left) {
        if (root == null) {
            return;
        }
        int val = root.val;
        list.add(val);
        if (root.left == null && root.right == null && left == root.val) {
            res.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }
        left -= val;
        dfs(root.left, list, left);
        dfs(root.right, list, left);
        list.remove(list.size() - 1);
    }

}