package com.yupi.algorithm.leetcode.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：重复的DNA序列
 * 思路：主要在于设计hash的键值，如果存字符串，内存占用太大，可以利用哈夫曼原理，
 * 利用2位二进制表示4个字符，因此10个字符可映射成一个20bit的整数，然后滑动窗口即可
 */

public class FindRepeatedDnaSequences {

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() < 11) {
            return res;
        }
        int len = s.length();
        Map<Integer, Integer> map = new HashMap<>();
        int val = 0;
        for (int i = 0; i < 10; i++) {
            val <<= 2;
            char c = s.charAt(i);
            val += getVal(c);
        }
        map.put(val, 1);
        int mask = 0x000fffff;
        for (int i = 10; i < len; i++) {
            val <<= 2;
            val &= mask;
            val += getVal(s.charAt(i));
            int count = map.getOrDefault(val, 0);
            if (count == 1) {
                res.add(s.substring(i - 9, i + 1));
            }
            map.put(val, count + 1);
        }
        return res;
    }

    private int getVal(char c) {
        switch (c) {
            case 'A':
                return 1;
            case 'C':
                return 2;
            case 'G':
                return 3;
            default:
                return 4;
        }
    }

}