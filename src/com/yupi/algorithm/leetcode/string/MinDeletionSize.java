package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：删除列使之有序
 * <p>
 * 思路：水题
 */

public class MinDeletionSize {

    public int minDeletionSize(String[] A) {
        int res = 0;
        int len = A[0].length();
        for (int i = 0; i < len; i++) {
            boolean flag = true;
            for (int j = 1; j < A.length; j++) {
                if (A[j].charAt(i) < A[j - 1].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                res++;
            }
        }
        return res;
    }
}