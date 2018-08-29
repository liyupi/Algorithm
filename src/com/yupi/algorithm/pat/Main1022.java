package com.yupi.algorithm.pat;

import java.util.Scanner;

/**
 * 功能描述：挖掘机（水题）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1022 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] total = new int[100001];
            int maxPos = 0;
            int maxScore = -1;
            while (n-- > 0) {
                int no = sc.nextInt();
                int score = sc.nextInt();
                total[no] += score;
                if (total[no] >= maxScore) {
                    maxPos = no;
                    maxScore = total[no];
                }
            }
            System.out.println(maxPos + " " + maxScore);
        }
    }
}