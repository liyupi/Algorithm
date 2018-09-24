package com.yupi.algorithm.leetcode.tree.nx;

import java.util.List;

/**
 * 功能描述：N叉树节点
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

}
