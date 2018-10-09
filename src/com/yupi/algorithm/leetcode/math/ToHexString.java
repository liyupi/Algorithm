package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：整数转16进制字符串
 * <p>
 * 思路：（1）笨方法，利用除余法依次转换
 * （2）位运算，屏蔽高位，每次取4位
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class ToHexString {

/*  方法1：按位取余

    public String toHex(int num) {
        return toHexString(num);
    }

    public String toHexString(long num) {
        if (num == 0) {
            return "0";
        }
        if (num < 0) {
            return toHexString(0xffffffffL + 1 + num);
        }
        String res = "";
        while (num != 0) {
            long n = num % 16;
            num /= 16;
            if (n >= 10) {
                res = (char) (n + 87) + res;
            } else {
                res = n + res;
            }
        }
        return res;
    }*/

    /**
     * 方法2：位运算
     */
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        int mask = 0xf;
        char[] hexTable = new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String res = "";
        while (num != 0) {
            int n = num & mask;
            res = hexTable[n] + res;
            // 此处使用无符号右移（空位按0补齐）
            num >>>= 4;
        }
        return res;
    }


}