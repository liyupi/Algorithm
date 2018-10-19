package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

/**
 * 功能描述：判断一个树是否为另一个树的子树
 *
 * 思路：依次以要查找的树的每个节点为根节点，判断是否和子树相等
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class IsSubTree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        return isSameTree(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    public boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null || s.val != t.val) {
            return false;
        }
        return isSameTree(s.left,t.left) && isSameTree(s.right,t.right);
    }

}