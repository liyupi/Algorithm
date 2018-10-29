package com.yupi.algorithm.leetcode.bit;

/**
 * 功能描述：交替位二进制数
 *
 * 思路：利用异或和与运算可快速解决
 */
public class HasAlternatingBits {

    public boolean hasAlternatingBits(int n) {
        n = n ^ (n >>> 1);
        return (n & n + 1) == 0;
        /*if (n == 0) {
            return true;
        }
        boolean zero = (n & 1) == 0;
        while (n != 0) {
            n >>>= 1;
            int num = n & 1;
            if (zero && num == 0) {
                return false;
            }
            if (!zero && num == 1) {
                return false;
            }
            zero = !zero;
        }
        return true;*/
    }

}
