package com.yupi.algorithm.pat;

import java.util.Scanner;

/**
 * 功能描述：部分和
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1006
{
    static int getP(String str, int d)
    {
        int len = str.length();
        int sum = 0;
        for (int i = 0; i < len; i++)
        {
            if (str.charAt(i) - 48 == d)
            {
                sum = sum * 10 + d;
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String a = sc.next();
            int da = sc.nextInt();
            String b = sc.next();
            int db = sc.nextInt();
            System.out.println(getP(a, da) + getP(b, db));
        }
    }
}
