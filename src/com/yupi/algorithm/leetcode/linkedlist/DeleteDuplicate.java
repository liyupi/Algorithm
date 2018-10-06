package com.yupi.algorithm.leetcode.linkedlist;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

/**
 * 功能描述：相同的树
 * 
 * 注意陷阱：如"aaa   "
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class DeleteDuplicate {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

}