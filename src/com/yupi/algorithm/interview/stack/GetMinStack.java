package com.yupi.algorithm.interview.stack;

import java.util.Stack;

/**
 * getMin功能栈
 * @author Yupi Li
 * @date 19/03/22
 */
public class GetMinStack {

    private Stack<Integer> dataStack;

    private Stack<Integer> minStack;

    GetMinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    Integer pop() {
        Integer num = dataStack.pop();
        if (num.equals(minStack.peek())) {
            minStack.pop();
        }
        return num;
    }

    void push(Integer obj) {
        dataStack.push(obj);
        if (minStack.isEmpty() || minStack.peek() >= obj) {
            minStack.push(obj);
        }
    }

    Integer getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        GetMinStack getMinStack = new GetMinStack();
        getMinStack.push(2);
        getMinStack.push(4);
        getMinStack.push(3);
        getMinStack.push(1);
        getMinStack.push(5);
        System.out.println(getMinStack.getMin());
        System.out.println(getMinStack.pop());
        System.out.println(getMinStack.pop());
        System.out.println(getMinStack.getMin());
    }

}
