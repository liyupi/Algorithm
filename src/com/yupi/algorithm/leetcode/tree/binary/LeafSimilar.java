package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：相似叶子
 */

public class LeafSimilar {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1 = getLeafs(root1, list1);
        list2 = getLeafs(root2, list2);
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private List<Integer> getLeafs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        if (root.left == null && root.right == null) {
            list.add(root.val);
        }
        if (root.left != null) {
            getLeafs(root.left, list);
        }
        if (root.right != null) {
            getLeafs(root.right, list);
        }
        return list;
    }

}