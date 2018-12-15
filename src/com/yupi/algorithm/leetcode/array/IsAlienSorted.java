package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：验证外形词典
 * 思路：用数组记录字典序，若单词有序，则一次遍历比较相邻单词即可
 */

public class IsAlienSorted {

    public boolean isAlienSorted(String[] words, String order) {
        int[] dic = new int[123];
        int len = order.length();
        for (int i = 0; i < len; i++) {
            dic[order.charAt(i)] = i;
        }
        for (int i = 1; i < words.length; i++) {
            if (!compare(dic, words[i - 1], words[i])) {
                return false;
            }
        }
        return true;
    }

    boolean compare(int[] dic, String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int min = Math.min(lenA, lenB);
        for (int i = 0; i < min; i++) {
            if (dic[b.charAt(i)] > dic[a.charAt(i)]) {
                return true;
            } else if (dic[b.charAt(i)] < dic[a.charAt(i)]) {
                return false;
            }
        }
        return a.length() < b.length();
    }
}