package com.yupi.algorithm.leetcode.tree.bst;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：判断BST中是否存在两数的和等于目标值
 *
 */

public class FindTarget {

    private Map<Integer,Integer> map = new HashMap<>();

    public boolean findTarget(TreeNode root, int k) {
        if(root == null) {
            return false;
        }
        boolean left = findTarget(root.left, k);
        if (map.containsKey(k - root.val)) {
            return true;
        } else {
            map.put(root.val, 0);
        }
        return left || findTarget(root.right,k);
    }

}