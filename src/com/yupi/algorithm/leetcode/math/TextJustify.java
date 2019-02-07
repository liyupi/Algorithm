package com.yupi.algorithm.leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：文本左右对齐
 * 思路：难点在于平均分配空格（有些单词间的空格应该少1个），用数学公式求得应少1个空格的数量
 * LeetCode 68
 */

public class TextJustify {

    public List<String> fullJustify(String[] words, int maxWidth) {
        int left = 0;
        int right = 0;
        int len = 0;
        List<String> list = new ArrayList<>();
        while (right != words.length) {
            int temp = words[right].length();
            int count = right - left - 1;
            if (len + temp + count > maxWidth) {
                StringBuilder sb = new StringBuilder();
                int space = (int) Math.ceil((double) (maxWidth - len) / count);
                int num = count - count * space + (maxWidth - len);
                for (int i = left; i < right - 1; i++) {
                    sb.append(words[i]);
                    int tempS = space;
                    if (num-- <= 0) {
                        tempS = space - 1;
                    }
                    for (int j = 0; j < tempS; j++) {
                        sb.append(" ");
                    }
                }
                sb.append(words[right - 1]);
                if (count == 0) {
                    int time = maxWidth - len;
                    while (time-- > 0) {
                        sb.append(" ");
                    }
                }
                len = temp;
                left = right;
                list.add(sb.toString());
            } else {
                len += temp;
            }
            right++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = left; i < right - 1; i++) {
            sb.append(words[i]).append(" ");
        }
        sb.append(words[right - 1]);
        int space = maxWidth - sb.length();
        while (space-- > 0) {
            sb.append(" ");
        }
        list.add(sb.toString());
        return list;
    }

}