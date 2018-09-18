/**
 * 功能描述：自建哈希表（其实应该是数组加链表）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class Main {

    class MyHashMap {

        int[][] bucket;

        /**
         * Initialize your data structure here.
         */
        public MyHashMap() {
            this.bucket = new int[1000][1000];
        }

        public void remove(int key) {
            bucket[key / 1000][key % 1000] = 0;
        }

        /**
         * value will always be positive.
         */
        public void put(int key, int value) {
            bucket[key / 1000][key % 1000] = value + 1;
        }

        /**
         * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
         */
        public int get(int key) {
            return bucket[key / 1000][key % 1000] - 1;
        }

    }


}