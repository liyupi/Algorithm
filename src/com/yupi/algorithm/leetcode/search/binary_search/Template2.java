package com.yupi.algorithm.leetcode.search.binary_search;

import java.util.Scanner;

/**
 * 功能描述：二分查找进阶模板题
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Template2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int count = 0;
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = (3 * n + 1) / 2;
                }
                count++;
            }
            System.out.println(count);
        }
    }

    public boolean isBadVersion(int num) {
        return true;
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int middle = left + (right-left)/ 2;
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}