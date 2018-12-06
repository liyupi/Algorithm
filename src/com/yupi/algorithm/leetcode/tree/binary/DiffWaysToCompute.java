package com.yupi.algorithm.leetcode.tree.binary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：为运算表达式设计优先级
 * 思路：原理类似给定中序和先序构建二叉树，递归每个运算符左边可能的值与右边可能的值运算即可
 * hashmap防止重复运算
 */

public class DiffWaysToCompute {

    private Map<String, List<Integer>> map = new HashMap<>();

    public List<Integer> diffWaysToCompute(String input) {
        if (map.containsKey(input)) {
            return map.get(input);
        }
        int len = input.length();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i + 1));
                for (Integer leftVal : left) {
                    for (Integer rightVal : right) {
                        if (c == '+') {
                            res.add(leftVal + rightVal);
                        } else if (c == '-') {
                            res.add(leftVal - rightVal);
                        } else {
                            res.add(leftVal * rightVal);
                        }
                    }
                }
            }
        }
        if (res.isEmpty()) {
            res.add(Integer.valueOf(input));
        }
        map.put(input, res);
        return res;
    }
}