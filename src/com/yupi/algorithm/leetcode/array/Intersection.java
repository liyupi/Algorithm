package com.yupi.algorithm.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 功能描述：求两数组交集
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i)){
                set2.add(i);
            }
        }
        int[] array = new int[set2.size()];
        int index = 0;
        for (Integer integer : set2) {
            array[index++] = integer;
        }
        return array;
    }
}