package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：猜新娘
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1023 {

    public static long getC(int m, int n) {
        long mum = 1;
        long son = 1;
        long side = 1;
        for (int i = 2; i <= n; i++) {
            mum*=i;
        }
        for (int i = 2; i <= m; i++) {
            son*=i;
        }
        for (int i = 2; i <= (n-m); i++) {
            side*=i;
        }
        return mum/(son*side);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long arr[] = new long[21];
        arr[2] = 1;
        arr[3] = 2;
        for (int i = 4; i <= 20; i++) {
            arr[i] = (i - 1) * ((arr[i - 1]) + (arr[i - 2]));
        }
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(arr[m]*getC(m,n));
        }
    }
}