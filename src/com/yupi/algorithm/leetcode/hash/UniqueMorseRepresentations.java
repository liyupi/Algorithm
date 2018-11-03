package com.yupi.algorithm.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * 功能描述：不同摩斯密码的个数
 */

public class UniqueMorseRepresentations {

    private String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            char[] chars = words[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                sb.append(codes[chars[j] - 65]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
