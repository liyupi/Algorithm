package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：约瑟夫环基础
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1032 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            boolean[] out = new boolean[n];
            int s = 0;
            for (int i = 2; i <= n; i++) {
                s = (s + m) % i;
            }
            System.out.println(s + 1);
        }
    }
    
}