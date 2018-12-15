package com.yupi.algorithm.leetcode.tree.binary;

/**
 * 功能描述：验证二叉树的前序序列化
 * 思路：pos变量记录可插入的节点位置数（初值为1）
 * 每多一个数字，位置+1，否则位置-1，位置为0时则表示没有位置插入字符
 * 最后结果为pos == 0
 */

public class IsValidSerialization {

    public boolean isValidSerialization(String preorder) {
        String[] word = preorder.split(",");
        int pos = 1;
        for (String s : word) {
            if (pos == 0) {
                return false;
            }
            if ("#".equals(s)) {
                pos--;
            } else {
                pos++;
            }
        }
        return pos == 0;
    }

}