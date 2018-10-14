package com.yupi.algorithm.leetcode.stack.heap;

import java.util.Stack;

/**
 * 功能描述：补多少括号使等式成立
 *
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class MinAddToMakeValid {

    public int minAddToMakeValid(String S) {
        int len = S.length();
        Stack<Character> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            char c = S.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    sum++;
                } else {
                    stack.pop();
                }
            }
        }
        return sum + stack.size();
    }
}