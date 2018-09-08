package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：砍半
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1033 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int count = 0;
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = (3 * n + 1) / 2;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}