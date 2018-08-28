package com.yupi.algorithm.pat;

import java.util.Scanner;

/**
 * 功能描述：数字分类
 *
 * @author Yupi Li
 * @date 2018/8/12 9:29
 */
public class Main1002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int a1 = 0;
            int a2 = 0;
            boolean add = true;
            int a3 = 0;
            double a4 = 0f;
            int num = 0;
            int a5 = 0;
            int val;
            for (int i = 0; i < n; i++) {
                val = sc.nextInt();
                if (val % 5 == 0 && val % 2 == 0) {
                    a1 += val;
                    continue;
                }
                if (val % 5 == 1) {
                    if (add) {
                        a2 += val;
                        add = false;
                    } else {
                        a2 -= val;
                        add = true;
                    }
                    continue;
                }
                if (val % 5 == 2) {
                    a3++;
                    continue;
                }
                if (val % 5 == 3) {
                    a4 += val;
                    num++;
                    continue;
                }
                a5 = val > a5 ? val : a5;
            }
            if (a4 == 0) {
                System.out.printf("%s %s %s %s %s", a1 == 0 ? "N" : a1, a2 == 0 ? "N" : a2, a3 == 0 ? "N" : a3, "N", a5 == 0 ? "N" : a5);
            } else {
                System.out.printf("%s %s %s %.1f %s", a1 == 0 ? "N" : a1, a2 == 0 ? "N" : a2, a3 == 0 ? "N" : a3, a4 / num, a5 == 0 ? "N" : a5);
            }
        }
    }
}
