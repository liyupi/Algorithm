package com.yupi.algorithm.interview.stack;

import java.util.Stack;

/**
 * 用栈实现对另一个栈的排序
 * @author Yupi Li
 * @date 19/03/22
 */
public class StackSort {

    static void stackSort(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            Integer num = stack.pop();
            while (!help.isEmpty() && help.peek() < num) {
                stack.push(help.pop());
            }
            help.push(num);
        }
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stackSort(stack);
        for (Integer num : stack) {
            System.out.println(num);
        }
    }
}
