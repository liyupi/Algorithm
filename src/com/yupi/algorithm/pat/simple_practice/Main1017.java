package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：求十进制数对应的R进制形式
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1017 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            StringBuilder stringBuilder = new StringBuilder();
            while (n != 0) {
                int val = n % r;
                if (val >= 0 && val <= 9) {
                    stringBuilder.insert(0, val);
                } else {
                    stringBuilder.insert(0, (char) (val + 55));
                }
                n /= r;
            }
            System.out.println(stringBuilder);
        }
    }
}