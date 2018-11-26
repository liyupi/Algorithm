package com.yupi.algorithm.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 功能描述：字符串的排列
 *
 * 思路：利用集合记录当前不满足的字符数量，利用滑动窗口，每次移动去除或添加不满足的字符到集合
 * 集合为空时，表示字符串的某排列是另一个字符串的子串。
 */

public class CheckInclusion {

    public boolean checkInclusion(String s1, String s2) {
        int[] map1 = new int[123];
        int[] map2 = new int[123];
        int len1 = s1.length();
        int len2 = s2.length();
        if (len2 < len1) {
            return false;
        }
        for (int i = 0; i < len1; i++) {
            map1[s1.charAt(i)]++;
            map2[s2.charAt(i)]++;
        }
        Set<Integer> diff = new HashSet<>();
        for (int i = 97; i < 123; i++) {
            if (map1[i] != map2[i]) {
                diff.add(i);
            }
        }
        if (diff.isEmpty()) {
            return true;
        }
        for (int i = len1; i < len2; i++) {
            int newC = s2.charAt(i);
            int oldC = s2.charAt(i - len1);
            if (newC == oldC) {
                continue;
            }
            map2[newC]++;
            map2[oldC]--;
            if (map2[newC] == map1[newC]) {
                diff.remove(newC);
            } else {
                diff.add(newC);
            }
            if (map2[oldC] == map1[oldC]) {
                diff.remove(oldC);
            } else {
                diff.add(oldC);
            }
            if (diff.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}