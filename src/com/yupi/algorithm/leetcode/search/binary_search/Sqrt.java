package com.yupi.algorithm.leetcode.search.binary_search;

/**
 * 功能描述：二分法求平方根
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Sqrt {

    public int mySqrt(int x) {
        long left = 0;
        long right = 65536;
        while (left<=right) {
            long middle = (left+right)/2;
            if (middle*middle > x){
                right = middle-1;
            } else if (middle*middle < x){
                if ((middle+1)*(middle+1)>x){
                    return (int)middle;
                } else {
                    left = middle + 1;
                }
            } else {
                return (int)middle;
            }
        }
        return 1;
    }

}