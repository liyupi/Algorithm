package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：相对排名
 *
 * 思路：两种做法
 * （1）拿时间换空间，利用map集合进行排序
 * （2）空间换时间，求得最大值和最小值，用最大值开数组，键为成绩，值为位置，如成绩为[10,7,6,4,3]，
 * 倒序遍历数组，用prize记录当前名次，即成绩为10的最先遍历到，是第1名，取map[10]=0，res[0] = prize，以此类推
 *
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class FindRelativeRanks {

    public String[] findRelativeRanks(int[] nums) {
        int max = 0;
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i],max);
            min = Math.min(nums[i],min);
        }
        int[] map = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            map[nums[i]] = i + 1;
        }
        String[] res = new String[nums.length];
        int prize = 0;
        String[] prizes = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        for (int i = map.length - 1; i >= min; i--) {
            int pos = map[i] - 1;
            if (pos < 0) {
                continue;
            }
            if (prize < 3) {
                res[pos] = prizes[prize++];
            } else {
                res[pos] = String.valueOf(++prize);
            }
        }
        return res;
    }


    /*public String[] findRelativeRanks(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>((a, b) -> {
            if (a > b) {
                return -1;
            } else if (a < b) {
                return 1;
            } else {
                return 0;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        String[] prize = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        String[] res = new String[nums.length];
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (count < 3) {
                res[entry.getValue()] = prize[count++];
                continue;
            }
            res[entry.getValue()] = String.valueOf(++count);
        }
        return res;
    }*/

}