package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：亲密字符串
 *
 * 思路：必须交换一位才符合，可以用数组记录每个字母出现次数
 * 如果两个字符串完全相同则必须有一个字母出现至少两次（可交换）才算亲密
 */

public class BuddyStrings {

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        int[] has = new int[123];
        char d1 = 0;
        char d2 = 0;
        boolean flag = false;
        for (int i = 0; i < A.length(); i++) {
            char charA = A.charAt(i);
            has[charA]++;
            char charB = B.charAt(i);
            if (charA != charB) {
                if (flag) {
                    return false;
                }
                if (d1 == 0) {
                    d1 = charA;
                    d2 = charB;
                } else {
                    if (charA != d2 || charB != d1) {
                        return false;
                    }
                    flag = true;
                }
            }
        }
        if (!flag) {
            for (int i = 97; i < has.length; i++) {
                if (has[i] > 1) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

}