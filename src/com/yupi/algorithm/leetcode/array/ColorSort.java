package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：颜色分类
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class ColorSort {

    public static void main(String[] args) {
        new ColorSort().sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }

    public void sortColors(int[] nums) {
        int i = -1;
        int j = -1;
        int k = -1;
        for (int l = 0; l < nums.length; l++) {
            if (nums[l] == 0) {
                nums[++k] = 2;
                nums[++j] = 1;
                nums[++i] = 0;
            } else if (nums[l] == 1) {
                nums[++k] = 2;
                nums[++j] = 1;
            } else {
                nums[++k] = 2;
            }
        }
    }

}