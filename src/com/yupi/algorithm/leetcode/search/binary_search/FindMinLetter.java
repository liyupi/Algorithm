package com.yupi.algorithm.leetcode.search.binary_search;

/**
 * 功能描述：寻找比目标字母大的最小字母
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class FindMinLetter {

    public static void main(String[] args) {
        System.out.println(new FindMinLetter().nextGreatestLetter(new char[]{'c', 'f', 'g'}, 'k'));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (letters[middle] > target) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return letters[left] > target ? letters[left] : letters[0];
    }
}