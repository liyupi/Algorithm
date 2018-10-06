package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

import java.util.*;

/**
 * 功能描述：自底向上层次遍历二叉树
 *
 * 注意陷阱：如"aaa   "
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class LevelOrderBottom {

    private Stack<List<Integer>> stack = new Stack<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int num = 1;
        while (!queue.isEmpty()) {
            int next = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                    next++;
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    next++;
                }
            }
            num = next;
            stack.push(list);
        }
        while (!stack.empty()) {
            res.add(stack.pop());
        }
        return res;
    }

}