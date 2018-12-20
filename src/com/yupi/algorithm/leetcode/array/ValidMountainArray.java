package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：有效的山脉数组
 * 思路：先判断连续递增，再判断连续递减即可
 */

public class ValidMountainArray {

    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int pos = 1;
        while (A[pos] > A[pos - 1]) {
            pos++;
            if (pos == A.length) {
                return false;
            }
        }
        if (pos == 1 || A[pos] == A[pos - 1]) {
            return false;
        }
        while (pos != A.length) {
            if (A[pos] >= A[pos - 1]) {
                return false;
            }
            pos++;
        }
        return true;
    }}