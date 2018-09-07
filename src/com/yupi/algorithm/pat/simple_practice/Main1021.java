package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：抽奖
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1021 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long arr[] = new long[21];
        arr[2] = 1;
        arr[3] = 2;
        double multiply = 6;
        double result[] = new double[21];
        result[0] = 0;
        result[1] = 0;
        result[2] = 0.5;
        result[3] = 1/3.0;
        for (int i = 4; i <= 20; i++) {
            arr[i] = (i - 1) * ((arr[i - 1]) + (arr[i - 2]));
            multiply *= i;
            result[i] = arr[i]/multiply;
        }
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.printf("%.2f%%\n",result[n]*100);
        }
    }
}