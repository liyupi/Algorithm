package com.yupi.algorithm.leetcode.array;

import java.util.Arrays;

/**
 * 功能描述：最大数
 *
 * 思路：巧妙地选取排序因素（如30和3，303<330）可将两数连接进行比较
 */

public class LargestNumber {

    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (a,b) -> {
            String str1 = a + b;
            String str2 = b + a;
            return str2.compareTo(str1);
        });
        if(strs[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String word: strs) {
            sb.append(word);
        }
        return sb.toString();
    }
}