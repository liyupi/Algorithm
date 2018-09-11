package com.yupi.algorithm.leetcode.search.binary_search;

/**
 * 功能描述：乘方
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Multiply {

    public double myPow(double x, int n) {
        boolean positive = true;
        if (n < 0) {
            n = -n;
            positive = false;
        }
        return positive ? myPowMethod(x, n) : 1 / myPowMethod(x, n);
    }

    public double myPowMethod(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        double res = myPowMethod(x, n / 2);
        if (n % 2 == 0) {
            return res * res;
        } else {
            return res * res * x;
        }
    }

}