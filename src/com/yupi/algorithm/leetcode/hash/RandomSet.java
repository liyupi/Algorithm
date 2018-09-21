package com.yupi.algorithm.leetcode.hash;

import java.util.*;

/**
 * 功能描述：支持常数时间插入、删除、随机访问操作的数据结构
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class RandomSet {


    class RandomizedSet {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Random random = new Random();
        /**
         * Initialize your data structure here.
         */
        public RandomizedSet() {

        }

        /**
         * Inserts a value to the set. Returns true if the set did not already contain the specified element.
         */
        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            }
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }

        /**
         * Removes a value from the set. Returns true if the set contained the specified element.
         */
        public boolean remove(int val) {
            if (!map.containsKey(val) || list.size() == 0) {
                return false;
            }
            int pos = map.get(val);
            int last = list.get(list.size() - 1);
            list.set(pos, last);
            map.put(last, pos);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }

        /**
         * Get a random element from the set.
         */
        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }
    }
}