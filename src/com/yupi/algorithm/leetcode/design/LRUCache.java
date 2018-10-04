package com.yupi.algorithm.leetcode.design;

import java.util.HashMap;

/**
 * 功能描述：设计LRU缓存机制
 *
 * @author Yupi Li
 * @date 2018/10/3 09:37
 */

public class LRUCache {

    private ListNode head;
    private ListNode tail;
    private HashMap<Integer, ListNode> map = new HashMap<>();
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(2, 1);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(4, 1);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));
    }

    public int get(int key) {
        ListNode valueNode = map.get(key);
        if (valueNode == null) {
            return -1;
        }
        if (valueNode == head) {
            return valueNode.val;
        }
        if (valueNode == tail) {
            tail.pre.next = null;
            tail = tail.pre;
        } else {
            removeNode(valueNode);
        }
        addNode(valueNode);
        return valueNode.val;
    }

    public void put(int key, int value) {
        ListNode valueNode = map.get(key);
        if (valueNode != null) {
            valueNode.val = value;
            if (valueNode == head) {
                return;
            }
            if (valueNode == tail) {
                tail = valueNode.pre;
                tail.next = null;
            } else {
                removeNode(valueNode);
            }
            valueNode.next = head;
            head.pre = valueNode;
            head = head.pre;
            return;
        }
        if (capacity != 0 && map.size() == capacity) {
            map.remove(tail.key);
            if (capacity > 1) {
                tail.pre.next = null;
                tail = tail.pre;
            } else {
                head = tail = new ListNode(key, value);
                map.put(key, head);
                return;
            }
        }
        if (head == null) {
            head = new ListNode(key, value);
            tail = head;
            map.put(key, head);
            return;
        }
        addNode(new ListNode(key,value));
        map.put(key, head);
    }

    private void removeNode(ListNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void addNode(ListNode node) {
        node.next = head;
        head.pre = node;
        head = head.pre;
        head.pre = null;
    }

    class ListNode {
        ListNode next;
        ListNode pre;
        int key;
        int val;

        ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}