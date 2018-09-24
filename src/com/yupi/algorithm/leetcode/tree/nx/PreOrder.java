package com.yupi.algorithm.leetcode.tree.nx;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：前序遍历N叉树
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class PreOrder {

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) {
            return list;
        }
        list.add(root.val);
        for (Node child : root.children) {
            preorder(child);
        }
        return list;
    }

}