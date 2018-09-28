package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：回文数
 * <p>
 * 思路：如果是回文数，只需比较后一半的值反转是否等于前一半即可
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class IsPalindromeNum {

    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return reverse == x || reverse / 10 == x;
    }
}