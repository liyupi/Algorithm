package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：验证回文字符串II
 *
 * 思路：去掉的字符可能是左边也可能是右边，分别判断去掉后是否为回文即可
 */

public class ValidPalindrome {

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);
            if (c1 != c2) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            char c1 = s.charAt(left++);
            char c2 = s.charAt(right--);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }

}