package com.yupi.algorithm.leetcode.tree.bst;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：二叉搜索树中的众数
 *
 * 思路：中序遍历即为排序后的数组，但要求不使用额外空间，因此pre记录当前元素是否与上一个相同，count计数
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class FindMode {

    int pre = -1;
    int count = 0;
    int max = 0;
    List<Integer> list = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        middleOrder(root);
        int[] res = new int[list.size()];
        int i = 0;
        for (Integer integer : list) {
            res[i++] = integer;
        }
        return res;
    }

    public void middleOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        middleOrder(root.left);
        if (root.val == pre) {
            count++;
        } else {
            pre = root.val;
            count = 1;
        }
        if (count > max) {
            max = count;
            list.clear();
            list.add(root.val);
        } else if (count == max) {
            list.add(root.val);
        }
        middleOrder(root.right);
    }

    public static void main(String[] args){
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        new FindMode().findMode(node);
    }

}