package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：求第k个全排列
 * <p>
 * 思路：公式法
 * a1 = k / (n - 1)!
 * k1 = k % (n - 1)!
 *
 * a2 = k1 / (n - 2)!
 * k2 = k1 % (n - 2)!
 * ...
 *
 * an-1 = kn-2 / 1!
 * kn-1 = kn-2 / 1!
 *
 * an = kn-1 / 0!
 * kn = kn-1 % 0!
 */

public class GetKthPermutation {
    public String getPermutation(int n, int k) {
        int[] factorial =  new int[n + 1];
        factorial[0] = 1;
        factorial[1] = 1;
        for (int i = 2; i < n; i++) {
            factorial[i] = i * factorial[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i + 1);
        }
        StringBuilder res = new StringBuilder();
        // 字符串下标从0开始
        k--;
        for (int i = n; i >= 1; i--) {
            int pos = k / factorial[i - 1];
            k %= factorial[i - 1];
            res.append(sb.charAt(pos));
            sb.deleteCharAt(pos);
        }
        return res.toString();
    }
}