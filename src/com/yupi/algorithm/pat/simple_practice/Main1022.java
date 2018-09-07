package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：称硬币
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1022 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                continue;
            }
            int res = 0;
            while (n >= 2) {
                n = (int) Math.ceil(n / 3.0);
                res++;
            }
            System.out.println(res);
        }
    }
}