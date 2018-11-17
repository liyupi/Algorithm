package com.yupi.algorithm.leetcode.tree.bst;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：所有异构的二叉搜索树
 * <p>
 * 思路：递归函数返回从left到right范围内的异构树根节点列表。依次以范围内的每个值为根建树，
 * 遍历左子树根节点列表，右子树根节点列表，将所有情况加入到结果列表。
 */

public class GenerateTrees {

    public List<TreeNode> generateTrees(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        return generateSubTree(1, n);
    }

    // 从left到right范围内的异构树根节点列表
    public List<TreeNode> generateSubTree(int left, int right) {
        List<TreeNode> res = new ArrayList<>();
        if (left > right) {
            res.add(null);
            return res;
        }
        // 依次以每个点为根节点建树
        for (int i = left; i <= right; i++) {
            for (TreeNode leftSubTree : generateSubTree(left, i - 1)) {
                for (TreeNode rightSubTree : generateSubTree(i + 1, right)) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftSubTree;
                    root.right = rightSubTree;
                    res.add(root);
                }
            }
        }
        return res;
    }

}