package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：蜜蜂寻路
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1009
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            while (n-->0){
                int start = sc.nextInt();
                int end = sc.nextInt();
                int num = end - start;
                long a = 1;
                long b = 2;
                if (num == 1){
                    System.out.println(1);
                    continue;
                }
                if (num == 2){
                    System.out.println(2);
                    continue;
                }
                long sum = 0;
                for (int i = 3; i <= num; i++) {
                    sum = a+b;
                    a = b;
                    b = sum;
                }
                System.out.println(sum);
            }
        }
    }

}