package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：素数对猜想
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class Main1039 {

    static boolean[] notSu = new boolean[100001];

    public static void initSu() {
        for (int i = 2; i < notSu.length; i++) {
            if (!notSu[i]) {
                if (i < 1000) {
                    int j = i * i;
                    while (j < notSu.length) {
                        notSu[j] = true;
                        j += i;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = System.currentTimeMillis();
        initSu();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int res = 0;
            int pos = 2;
            for (int i = 2; i <= n; i++) {
                if (!notSu[i]) {
                    if (i - pos == 2) {
                        res++;
                    }
                    pos = i;
                }
            }
            System.out.println(res);
        }
    }
}