package com.yupi.algorithm.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * 功能描述：重复n次的元素
 * 思路：水题
 */

public class RepeatedNTimes {

    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int aA : A) {
            if (set.contains(aA)) {
                return aA;
            }
            set.add(aA);
        }
        return 0;
    }

}