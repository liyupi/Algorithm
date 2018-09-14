package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：删除数组重复值2
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class DeleteSameValue2 {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int len = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[len - 2]) {
                nums[len++] = nums[i];
            }
        }
        return len;
    }

    public static void main(String[] args){
        new DeleteSameValue2().removeDuplicates(new int[]{1,1,1,2,2,3});
    }

}