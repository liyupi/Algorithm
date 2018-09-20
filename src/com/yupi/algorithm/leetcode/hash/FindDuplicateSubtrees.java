package com.yupi.algorithm.leetcode.hash;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：寻找重复子树
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class FindDuplicateSubtrees {

    List<TreeNode> nodes = new LinkedList<>();
    Map<String, TreeNode> map = new HashMap<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        getSubtreesString(root);
        return nodes;
    }

    public String getSubtreesString(TreeNode root) {
        if (root == null) {
            return "x";
        }
        String str = String.valueOf(root.val);
        str += getSubtreesString(root.left);
        str += getSubtreesString(root.right);
        if (map.containsKey(str)) {
            if (map.get(str) == null) {
                nodes.add(root);
                map.put(str, root);
            }
        } else {
            map.put(str, null);
        }
        return str;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}