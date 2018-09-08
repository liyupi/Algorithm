package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：数桃子
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1024 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n==0){
                continue;
            }
            int res = 1;
            for (int i = 0; i < n - 1; i++) {
                res = (res + 1) * 2;
            }
            System.out.println(res);
        }
    }
}