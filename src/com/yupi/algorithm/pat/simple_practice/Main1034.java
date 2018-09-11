package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：拼音表示字串各位和
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1034 {

    private static String[] map = new String[]{"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            int len = str.length();
            long sum = 0;
            for (int i = 0; i < len; i++) {
                sum += str.charAt(i) - 48;
            }
            int[] res = new int[4];
            int count = 0;
            while (sum!=0) {
                res[count++] = (int)sum%10;
                sum/=10;
            }
            for (int i = count - 1; i >= 1; i--) {
                System.out.print(map[res[i]]+" ");
            }
            System.out.println(map[res[0]]);
        }
    }

}