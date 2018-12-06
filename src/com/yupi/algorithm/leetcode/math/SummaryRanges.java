package com.yupi.algorithm.leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：汇总区间
 * 思路：水题，一次遍历
 */

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        int left = nums[0];
        int right = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == right + 1) {
                right = nums[i];
            } else {
                if (left == right) {
                    res.add(String.valueOf(left));
                } else {
                    res.add(left + "->" + right);
                }
                left = right = nums[i];
            }
        }
        if (left == right) {
            res.add(String.valueOf(left));
        } else {
            res.add(left + "->" + right);
        }
        return res;
    }
}