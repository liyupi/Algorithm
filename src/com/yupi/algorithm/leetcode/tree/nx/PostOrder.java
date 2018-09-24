package com.yupi.algorithm.leetcode.tree.nx;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：后序遍历N叉树
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class PostOrder {

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null) {
            return list;
        }
        for (Node child : root.children) {
            postorder(child);
        }
        list.add(root.val);
        return list;
    }

}