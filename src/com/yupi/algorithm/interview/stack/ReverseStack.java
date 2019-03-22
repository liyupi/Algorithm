package com.yupi.algorithm.interview.stack;

import java.util.Stack;

/**
 * 使用递归和栈操作逆序一个栈
 * @author Yupi Li
 * @date 19/03/22
 */
public class ReverseStack {

    /**
     * 获取栈底元素
     * @param stack
     * @param <T>
     * @return
     */
    private static <T> T getAndRemoveBottomElement(Stack<T> stack) {
        T res = stack.pop();
        if (stack.isEmpty()) {
            return res;
        }
        T bottomElement = getAndRemoveBottomElement(stack);
        stack.push(res);
        return bottomElement;
    }

    /**
     * 反转栈
     * @param stack
     * @param <T>
     */
    static <T> void reverse(Stack<T> stack) {
        if (stack.isEmpty()) {
            return;
        }
        T val = getAndRemoveBottomElement(stack);
        reverse(stack);
        stack.push(val);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        ReverseStack.reverse(stack);
        for (Integer integer : stack) {
            System.out.println(integer);
        }
    }
}
