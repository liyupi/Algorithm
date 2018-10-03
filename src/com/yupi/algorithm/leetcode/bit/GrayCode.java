package com.yupi.algorithm.leetcode.bit;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：格雷码
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class GrayCode {

    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        int max = 1 << n;
        for (int i = 0; i < max; i++) {
            list.add((i >> 1) ^ i);
        }
        return list;
    }

}