package com.yupi.algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 功能描述：较大组的位置
 *
 * 思路：双指针
 */

public class LargeGroupPositions {

    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> list = new ArrayList<>();
        int count = 1;
        int left = 0;
        int len = S.length();
        for (int i = 1; i < len; i++) {
            char c = S.charAt(i);
            if (c == S.charAt(i - 1)) {
                count++;
            } else {
                if (count >= 3) {
                    list.add(Arrays.asList(left, left + count - 1));
                }
                left = i;
                count = 1;
            }
        }
        if (count >= 3) {
            list.add(Arrays.asList(left, left + count - 1));
        }
        return list;
    }
}