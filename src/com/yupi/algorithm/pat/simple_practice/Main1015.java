package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：skew数
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1015 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            int sum = 0;
            for (int i = s.length()-1; i >= 0; i--) {
                sum += (s.charAt(i)-48)*(Math.pow(2,s.length()-i)-1);
            }
            System.out.println(sum);
        }
    }
}