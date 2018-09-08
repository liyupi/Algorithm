package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：字符串个数和种类包含
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1028 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String a = sc.next();
            String b = sc.next();
            int lenA = a.length();
            int lenB = b.length();
            if (lenA < lenB) {
                System.out.println("No");
                continue;
            }
            int[] map = new int[91];
            for (int i = 0; i < lenA; i++) {
                map[a.charAt(i)]++;
            }
            boolean flag = true;
            for (int i = 0; i < lenB; i++) {
                char c = b.charAt(i);
                map[c]--;
                if (map[c] < 0) {
                    System.out.println("No");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Yes");
            }
        }
    }
}