package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：指定精度除法
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1026 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int z = a / b;
            int mod = a % b;
            StringBuilder stringBuilder = new StringBuilder(z + ".");
            for (int i = 0; i < n; i++) {
                mod *= 10;
                stringBuilder.append(mod / b);
                mod = mod % b;
            }
            System.out.println(stringBuilder);
        }
    }
}