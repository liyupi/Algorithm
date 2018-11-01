package com.yupi.algorithm.leetcode.dfs;

/**
 * 功能描述：1比特与2比特字符
 * <p>
 * 思路：直接循环，有1开头的数必定右移2位，0开头的数必定右移1位，看剩余1位还是0位即可
 */

public class IsOneBitCharacter {

    // 换成循环也一样
    boolean dfs(int[] bits, int pos) {
        if (pos == bits.length - 1) {
            return true;
        }
        if (pos >= bits.length) {
            return false;
        }
        if (bits[pos] == 0) {
            return dfs(bits, pos+1);
        }
        if (bits[pos] == 1) {
            return dfs(bits, pos + 2);
        }
        return false;
    }

    public boolean isOneBitCharacter(int[] bits) {
        return dfs(bits,0);
    }
}