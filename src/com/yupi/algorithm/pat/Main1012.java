package com.yupi.algorithm.pat;

import java.util.Scanner;

/**
 * 功能描述：D进制的A+B
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1012
{
    static String change(int sum, int rules)
    {
        StringBuilder stringBuilder = new StringBuilder();
        while (sum != 0)
        {
            int val = sum % rules;
            stringBuilder.insert(0, val);
            sum /= rules;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = a + b;
            System.out.println(change(sum, c));
        }
    }
}
