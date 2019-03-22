package com.yupi.algorithm.interview.stack;

import java.io.Serializable;
import java.util.Queue;
import java.util.Stack;

/**
 * 用栈实现队列
 * @author Yupi Li
 * @date 19/03/22
 */
public class StackQueue<T> {

    Stack<T> stackPush;

    Stack<T> stackPop;

    StackQueue() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    void add(T obj) {
        stackPush.push(obj);
    }

    T peek() {
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    T poll() {
        peek();
        return stackPop.pop();
    }

    public static void main(String[] args) {
        StackQueue<String> stackQueue = new StackQueue<>();
        stackQueue.add("haha");
        stackQueue.add("llaa");
        System.out.println(stackQueue.peek());
        System.out.println(stackQueue.poll());
        System.out.println(stackQueue.poll());
        stackQueue.add("go");
        System.out.println(stackQueue.poll());
    }


}
