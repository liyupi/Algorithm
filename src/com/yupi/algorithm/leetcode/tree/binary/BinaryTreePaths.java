package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：二叉树的所有路径
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class BinaryTreePaths {

    private List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        binaryTreePaths(root, "");
        return list;
    }

    public void binaryTreePaths(TreeNode root, String str) {
        if (root == null) {
            return;
        }
        str += root.val + "->";
        if (root.left == null && root.right == null) {
            list.add(str.substring(0,str.length() - 2));
        }
        if (root.left != null) {
            binaryTreePaths(root.left,str);
        }
        if (root.right != null) {
            binaryTreePaths(root.right,str);
        }
    }

}