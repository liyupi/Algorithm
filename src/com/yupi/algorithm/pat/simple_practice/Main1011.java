package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：判素数（水题）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class Main1011
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 0 && y == 0)
            {
                return;
            }
            String out = "OK";
            for (int i = x; i <= y; i++)
            {
                int t = i * i + i + 41;
                if (!isPrime(t))
                {
                    out = "Sorry";
                    break;
                }
            }
            System.out.println(out);
        }
    }

    public static boolean isPrime(int n)
    {
        if (n < 2)
        {
            return false;
        }
        if (n == 2 || n == 3 || n == 5)
        {
            return true;
        }
        if (n % 2 == 0)
        {
            return false;
        }
        if (n % 3 == 0)
        {
            return false;
        }
        if (n % 5 == 0)
        {
            return false;
        }
        for (int i = 7; i * i <= n; i += 2)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}