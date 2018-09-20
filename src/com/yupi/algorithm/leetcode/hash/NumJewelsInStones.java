package com.yupi.algorithm.leetcode.hash;

/**
 * 功能描述：统计字符串2中出现过字符串1中字符的数量
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class NumJewelsInStones {

    public int numJewelsInStones(String J, String S) {
        int[] map = new int[128];
        int jLen = J.length();
        int sLen = S.length();
        for (int i = 0; i < jLen; i++) {
            map[J.charAt(i)]++;
        }
        int res = 0;
        for (int i = 0; i < sLen; i++) {
            int c = S.charAt(i);
            if (map[c] > 0) {
                res++;
            }
        }
        return res;
    }

}