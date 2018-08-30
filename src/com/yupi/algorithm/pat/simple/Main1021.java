package com.yupi.algorithm.pat.simple;

import java.util.Scanner;

/**
 * 功能描述：查验身份证
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1021 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            boolean allPassed = true;
            while (n-- > 0) {
                boolean problem = false;
                String text = sc.next();
                int[] priority = new int[]{7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
                char[] code = new char[]{'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
                int sum = 0;
                for (int i = 0; i < priority.length; i++) {
                    char c = text.charAt(i);
                    if (c < '0' || c > '9') {
                        System.out.println(text);
                        problem = true;
                        break;
                    }
                    sum += (c - 48) * priority[i];
                }
                if (problem) {
                    allPassed = false;
                    continue;
                }
                char m = code[sum % 11];
                if (m != text.charAt(17)){
                    System.out.println(text);
                    allPassed = false;
                }
            }
            if (allPassed){
                System.out.println("All passed");
            }
        }

    }
}