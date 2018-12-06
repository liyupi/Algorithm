package com.yupi.algorithm.leetcode.math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：分数到小数
 * 思路：很恶心的题，边界值太多
 */

public class FractionToDecimal {

    public String fractionToDecimal(int numerator, int denominator) {
        Map<Long, Integer> map = new HashMap<>();
        List<Long> number = new ArrayList<>();
        int index = 0;
        int beginIndex = -1;
        StringBuilder builder = new StringBuilder();
        if (denominator == 0) {
            return "";
        }
        long num = numerator;
        long denum = denominator;
        if ((num < 0 && denum > 0) || (num > 0 && denum < 0)) {
            builder.append('-');
        }
        num = Math.abs(num);
        denum = Math.abs(denum);
        long val = num / denum;
        builder.append(String.valueOf(val));
        num = (num % denum) * 10;
        while (num != 0) {
            if (map.containsKey(num)) {
                beginIndex = map.get(num);
                break;
            } else {
                map.put(num, index++);
                val = num / denum;
                num = (num % denum) * 10;
                number.add(val);
            }
        }
        for (int i = 0; i < index; i++) {
            if (i == 0) {
                builder.append('.');
            }
            if (i == beginIndex) {
                builder.append('(');
            }
            builder.append(number.get(i));
        }
        if (beginIndex != -1) {
            builder.append(')');
        }
        return builder.toString();
    }
}