package com.yupi.algorithm.leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：找到数组中缺失的所有数字
 *
 * 思路：将数组当前位置的值作为下标，将数组中对应下标-1的值置为-1，这样出现过的数的位置值都为-1
 * 再顺序遍历一次，不为-1的位置+1即为未出现过的数
 *
 * 时间复杂度：o（n）
 * 空间复杂度：o（1）
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class FindDisappearedNumbers {


    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (num != -1) {
                int nextPos = num - 1;
                num = nums[nextPos];
                nums[nextPos] = -1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                list.add(i + 1);
            }
        }
        return list;
    }
}