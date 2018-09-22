package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：换个格式输出整数
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class Main1038 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int hundred = n / 100;
            int ten = n % 100 / 10;
            int one = n % 10;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < hundred; i++) {
                sb.append('B');
            }
            for (int i = 0; i < ten; i++) {
                sb.append('S');
            }
            for (int i = 1; i <= one; i++) {
                sb.append(i);
            }
            System.out.println(sb.toString());
        }
    }
}