package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：旋转数字
 * 思路：如果是非法数字，可以直接跳过一些数（比如300-399开头是3，可直接跳过301-399的遍历）
 */

public class RotatedDigits {

    public int rotatedDigits(int N) {
        int res = 0;
        for (int i = 1; i <= N; ) {
            boolean effective = true;
            boolean equal = true;
            int num = i;
            int add = 1;
            while (num != 0) {
                int temp = num % 10;
                if (temp == 2 || temp == 5 || temp == 6 || temp == 9) {
                    equal = false;
                } else if (temp == 3 || temp == 4 || temp == 7) {
                    effective = false;
                    break;
                }
                add *= 10;
                num /= 10;
            }
            i += effective? 1 : add;
            if (effective && !equal) {
                res++;
            }
        }
        return res;
    }

}