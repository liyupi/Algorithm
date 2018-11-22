package com.yupi.algorithm.leetcode.bfs;

import java.util.*;

/**
 * 功能描述：单词接龙
 *
 * 思路：找最短路问题，使用bfs，为防止重复，遍历过的单词从字典中删除
 */

public class LadderLength {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>();
        for (String s : wordList) {
            set.add(s);
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int time = 0;
        int size = 1;
        int nextSize = 0;
        while (!queue.isEmpty()) {
            time++;
            for (int i = 0; i < size; i++) {
                String str = queue.poll();
                if (str.equals(endWord)) {
                    return time;
                }
                for (int k = 0; k < str.length(); k++) {
                    StringBuilder sb = new StringBuilder(str);
                    for (int j = 97; j < 123; j++) {
                        sb.setCharAt(k, (char) j);
                        String tmp = sb.toString();
                        if (set.contains(tmp)) {
                            nextSize++;
                            queue.offer(tmp);
                            set.remove(tmp);
                        }
                    }
                }
            }
            size = nextSize;
            nextSize = 0;
        }
        return 0;
    }

}