package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：判断任意进制是否存在回文串
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1019 {

    public static boolean isReverseString(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            boolean flag = false;
            for (int i = 2; i <= 16; i++) {
                int n = num;
                StringBuilder sb = new StringBuilder();
                while (n != 0) {
                    int val = n % i;
                    if (val >= 10) {
                        val += 55;
                    } else {
                        val += 48;
                    }
                    sb.insert(0, (char) val);
                    n /= i;
                }
                if (isReverseString(sb.toString())) {
                    System.out.println("Yes");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("No");
            }
        }
    }
}