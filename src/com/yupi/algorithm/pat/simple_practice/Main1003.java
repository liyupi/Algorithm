package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：养兔子（水题）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1003
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int n = sc.nextInt();
            long a = 1;
            long b = 2;
            if(n==1||n==2){
                System.out.println(n);
                continue;
            }
            long sum = 0;
            for (int i = 2; i < n; i++)
            {
                sum = a+b;
                a = b;
                b = sum;
            }
            System.out.println(sum);
        }
    }

}