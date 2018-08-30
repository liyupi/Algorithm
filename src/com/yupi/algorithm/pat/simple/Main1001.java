package com.yupi.algorithm.pat.simple;

import java.util.Scanner;

/**
 * 功能描述：A+B和C
 *
 * @author Yupi Li
 * @date 2018/8/12 9:29
 */
public class Main1001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 1; i <= times; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            System.out.println("Case #"+i+": "+(a+b>c));
        }
    }
}
