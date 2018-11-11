package com.yupi.algorithm.leetcode.dfs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 功能描述：全排列II
 * <p>
 * 思路：全排列即数组元素依次交换，先和首位依次交换，再和第二位依次交换...（替代原来的传list递归的方式）
 * dfs的过程中需要添加判断，拿集合记录是否有重复的元素和起始元素交换过
 */

public class PermuteUnique {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        dfs(nums, 0);
        return res;
    }

    void dfs(int[] nums, int start) {
        if (start == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            res.add(list);
            return;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
            swap(nums, start, i);
            dfs(nums, start + 1);
            swap(nums, start, i);
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}