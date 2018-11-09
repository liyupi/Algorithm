package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：找全排列的下一个排列
 * <p>
 * 思路：字典序排列：基于顺序最小，逆序最大原则
 * （1）从末尾找逆序数组终止位置（2）从末尾找刚刚大于终止位置的元素并交换
 * （3）将终止位置后的数组调整为正序
 */

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int pos = findReversePos(nums);
        if (pos != -1) {
            int largerPos = findLargerPos(pos, nums);
            swap(nums,pos,largerPos);
        }
        reverse(nums,pos);
    }

    private void reverse(int[] nums, int pos) {
        int left = pos + 1;
        int right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private int findLargerPos(int pos, int[] nums) {
        for (int i = nums.length - 1; i > pos; i--) {
            if (nums[i] > nums[pos]) {
                return i;
            }
        }
        return -1;
    }

    private void swap(int[] nums, int pos, int largerPos) {
        int temp = nums[pos];
        nums[pos] = nums[largerPos];
        nums[largerPos] = temp;
    }

    private int findReversePos(int[] nums) {
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                return i - 1;
            }
        }
        return -1;
    }


}