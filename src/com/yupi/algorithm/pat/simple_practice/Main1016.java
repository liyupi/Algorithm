package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：求任意进制1的个数
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1016 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int count = 0;
            while (n != 0) {
                if (n % r == 1) {
                    count++;
                }
                n /= r;
            }
            System.out.println(count);
        }
    }
}