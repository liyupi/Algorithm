package com.yupi.algorithm.leetcode.tree.trie;

/**
 * 功能描述：数组中两个数的最大异或值
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class FindMaximumXOR {

    class Node {
        Node[] child = new Node[2];
    }

    Node root = new Node();


    void insert(int num) {
        Node node = root;
        for (int i = 31; i >= 0; i--) {
            int val = (num >> i) & 1;
            if (node.child[val] == null) {
                node.child[val] = new Node();
            }
            node = node.child[val];
        }
    }

    int search(int num) {
        int res = 0;
        Node node = root;
        for (int i = 31; i >= 0; i--) {
            int val = (num >> i) & 1;
            res = res << 1;
            if (node.child[val] != null) {
                res++;
                node = node.child[val];
            } else {
                if (node.child[1-val] != null) {
                    node = node.child[1 - val];
                } else {
                    break;
                }
            }
        }
        return res;
    }

    public int findMaximumXOR(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(search(~nums[i]), max);
        }
        return max;
    }

    public static void main(String[] args) {
        new FindMaximumXOR().findMaximumXOR(new int[]{3, 10, 5, 25, 2, 8});
    }

}