package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

/**
 * 功能描述：根据二叉树创建字符串
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class Tree2Str {


    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(t.val);
        if (t.left == null && t.right == null) {
            return sb.toString();
        }
        if (t.left != null) {
            sb.append("(").append(tree2str(t.left)).append(")");
        } else {
            sb.append("()");
        }
        if (t.right != null) {
            sb.append("(").append(tree2str(t.right)).append(")");
        }
        return sb.toString();
    }

}