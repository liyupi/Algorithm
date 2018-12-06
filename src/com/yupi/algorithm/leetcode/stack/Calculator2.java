package com.yupi.algorithm.leetcode.stack;

import java.util.Stack;

/**
 * 功能描述：基本计算器II
 * 思路：使用栈来存放数，num来记录当前数，op来记录上一个操作符（初始为'+'）
 * 如果遇到其他符号或结尾则立即将符号记录到栈中，遇到乘除就弹出栈顶与当前数进行运算
 * 最后遍历栈，求和
 */

public class Calculator2 {

    public int calculate(String s) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        char lastOp = '+';
        int len = s.length();
        int num = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c >= 48) {
                num = num * 10 + c - 48;
            }
            if (i == len - 1 || (c < 48 && c != ' ')){
                switch (lastOp) {
                    case '-':
                        stack.push(-num);
                        break;
                    case '+':
                        stack.push(num);
                        break;
                    case '*':
                        stack.push(num * stack.pop());
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                    default:
                }
                lastOp = c;
                num = 0;
            }
        }
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}