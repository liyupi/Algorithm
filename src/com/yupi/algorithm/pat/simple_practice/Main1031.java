package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：绘制直方图
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1031 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            char[] chars = str.toCharArray();
            int[] map = new int[58];
            int max = 0;
            for (int i = 0; i < chars.length; i++) {
                max = ++map[chars[i]] > max ? map[chars[i]] : max;
            }
            for (int i = 0; i < max; i++) {
                for (int j = 0; j < 10; j++) {
                    if ((max - map[j+48]) > i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            System.out.println("0123456789");
        }
    }
}