package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：替换字符
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1030 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 32) {
                    continue;
                }
                chars[i] = (char) (chars[i] - 5);
                if (chars[i] < 65) {
                    chars[i] = (char) (chars[i] + 26);
                }
            }
            System.out.println(String.valueOf(chars));
        }
    }
}