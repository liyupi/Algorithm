package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：矩形面积
 * 思路：先找到不重叠的情况，4种
 * 再找到重叠矩形的左下角坐标和右上角坐标，总面积=S1+S2-重叠
 */

public class ComputeArea {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int sum = (D - B) * (C - A) + (G - E) * (H - F);
        if (C <= E || D <= F || A >= G || B >= H) {
            return sum;
        }
        return sum - ((Math.min(C, G) - Math.max(A, E)) * (Math.min(D, H) - Math.max(B, F)));
    }


}