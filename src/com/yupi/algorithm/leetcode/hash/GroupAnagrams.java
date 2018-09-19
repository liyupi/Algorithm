package com.yupi.algorithm.leetcode.hash;

import java.util.*;

/**
 * 功能描述：字母异位词分组
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class GroupAnagrams {

    String sortStr(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> stringListMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = sortStr(strs[i]);
            if (stringListMap.containsKey(str)){
                stringListMap.get(str).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                stringListMap.put(str,list);
            }
        }
        return new ArrayList<>(stringListMap.values());
    }

}