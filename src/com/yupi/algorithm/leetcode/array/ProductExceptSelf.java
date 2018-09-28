package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：除自身以外数组的乘积
 *
 * 思路：该数左边的所有数的乘积和右边的所有数的成绩相乘即可，
 * 左右依次遍历，使用一个数t来记录乘积
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int t = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = t;
            t *= nums[i];
        }
        t = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = t * res[i];
            t *= nums[i];
        }
        return res;
    }

}