package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：求十进制数对应的R进制各位和的R进制
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1018 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int sum = 0;
            while (n != 0) {
                int val = n % r;
                sum += val;
                n /= r;
            }
            StringBuilder sb = new StringBuilder();
            while (sum != 0) {
                int val = sum % r;
                if (val >= 10) {
                    val += 55;
                } else {
                    val += 48;
                }
                sb.insert(0, (char) val);
                sum /= r;
            }
            System.out.println(sb);
        }
    }
}