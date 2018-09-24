package com.yupi.algorithm.leetcode.tree.lca;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

/**
 * 功能描述：LCA模板题
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class LCA {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            return lowestCommonAncestor(root, q, p);
        }
        if (q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (p.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

}