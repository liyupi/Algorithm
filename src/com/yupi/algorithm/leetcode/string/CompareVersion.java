package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：比较版本号
 *
 * 思路：特殊情况较多，数范围小时可直接将整个串表示成数，否则拆分成字符串数组依次比较
 */

public class CompareVersion {

    public int compareVersion(String version1, String version2) {
        String[] words1 = version1.split("\\.");
        String[] words2 = version2.split("\\.");
        int min = Math.min(words1.length, words2.length);
        for (int i = 0; i < min; i++) {
            int num1 = Integer.parseInt(words1[i]);
            int num2 = Integer.parseInt(words2[i]);
            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            }
        }
        if (words1.length > words2.length) {
            for (int i = min; i < words1.length; i++) {
                int num1 = Integer.parseInt(words1[i]);
                if (num1 != 0) {
                    return 1;
                }
            }
        }
        if (words1.length < words2.length) {
            for (int i = min; i < words2.length; i++) {
                int num2 = Integer.parseInt(words2[i]);
                if (num2 != 0) {
                    return -1;
                }
            }
        }
        return 0;
    }
}