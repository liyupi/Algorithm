package com.yupi.algorithm.leetcode.hash;

/**
 * 功能描述：是否为同构字符串
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class IsIsomorphic {

    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        int[] mapst = new int[256];
        int[] mapts = new int[256];
        for (int i = 0; i < len; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (mapst[c1] == 0) {
                mapst[c1] = c2;
            }
            if (mapts[c2] == 0) {
                mapts[c2] = c1;
            }
            if (mapst[c1] != c2 || mapts[c2] != c1) {
                return false;
            }
        }
        return true;
    }

}