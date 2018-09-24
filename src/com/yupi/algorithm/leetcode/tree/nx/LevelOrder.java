package com.yupi.algorithm.leetcode.tree.nx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 功能描述：层次遍历N叉树
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class LevelOrder {


    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int size = 1;
        while (!queue.isEmpty()) {
            int nextN = 0;
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                subList.add(node.val);
                for (Node child : node.children) {
                    queue.offer(child);
                    nextN++;
                }
            }
            size = nextN;
            list.add(subList);
        }
        return list;
    }

}