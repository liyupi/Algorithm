package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：分解因数
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1013
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int n = sc.nextInt();
            int value = n;
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 2; n >= 2; i++)
            {
                while (n % i == 0)
                {
                    n /= i;
                    stringBuilder.append(i+" * ");
                }
            }
            System.out.println(value+" = "+stringBuilder.delete(stringBuilder.length()-3,stringBuilder.length()).toString());
        }
    }
}