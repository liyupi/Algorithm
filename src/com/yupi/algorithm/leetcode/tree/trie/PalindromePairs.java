package com.yupi.algorithm.leetcode.tree.trie;

import java.util.*;

/**
 * 功能描述：回文对（hard）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class PalindromePairs {
    private List<List<Integer>> list = new ArrayList<>();
    private Node root = new Node();

    public List<List<Integer>> palindromePairs(String[] words) {
        int len = words.length;
        if (len <= 1) {
            return list;
        }
        for (int i = 0; i < len; i++) {
            insert(words[i], i);
        }
        for (int i = 0; i < len; i++) {
            search(words[i],i);
            search(reverse(words[i]), i);
        }
        return list;
    }

    private void search(String str, int index) {
        int len = str.length();
        Node node = root;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (!node.children.containsKey(c)) {
                if (isPalindrome(str.substring(i))) {
                    break;
                }
            }
            node = node.children.get(c);
        }
        if (index != node.index) {
            list.add(Arrays.asList(node.index, index));
        }
    }

    private void insert(String str, int index) {
        int len = str.length();
        Node node = root;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (!node.children.containsKey(c)) {
                node.children.put(c, new Node());
            }
            node = node.children.get(c);
        }
        node.index = index;
    }

    private boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    private String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    class Node {
        Map<Character, Node> children = new HashMap<>();
        int index = -1;
    }

    public static void main(String[] args){
        new PalindromePairs().palindromePairs(new String[]{"abcd","dcba","lls","s","sssll"});
    }
}