package com.yupi.algorithm.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：单词模式
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        Map<Character,String> map = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();
        String[] strs = str.split(" ");
        int len = pattern.length();
        if (len != strs.length) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if(!map.get(c).equals(strs[i])) {
                    return false;
                }
            } else if (map2.containsKey(strs[i])){
                if (map2.get(strs[i]) != c) {
                    return false;
                }
            } else{
                map.put(c,strs[i]);
                map2.put(strs[i],c);
            }
        }
        return true;
    }

}