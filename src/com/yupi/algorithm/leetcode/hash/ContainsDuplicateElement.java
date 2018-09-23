package com.yupi.algorithm.leetcode.hash;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 功能描述：存在重复元素Ⅱ
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class ContainsDuplicateElement {

    public static void main(String[] args) {
        new ContainsDuplicateElement().containsNearbyAlmostDuplicate(new int[]{1, 5, 9, 1, 5, 9}, 2, 3);
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k < 1 || t < 0) {
            return false;
        }
        SortedSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            SortedSet<Long> subSet = set.subSet((long) nums[i] - t, (long) nums[i] + t + 1);
            if (!subSet.isEmpty()) {
                return true;
            }
            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
            set.add((long) nums[i]);
        }
        return false;
    }

}