package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：邮件数
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1020 {

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
            System.out.println(arr[n]);
        }
    }
}