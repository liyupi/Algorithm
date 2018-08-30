package com.yupi.algorithm.pat;

import java.util.Scanner;

/**
 * 功能描述：数珠子（水题）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1029
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String sold = sc.next();
            String want = sc.next();
            int sLen = sold.length();
            int wLen = want.length();
            int[] has = new int[123];
            for (int i = 0; i < sLen; i++)
            {
                has[sold.charAt(i)]++;
            }
            for (int i = 0; i < wLen; i++)
            {
                has[want.charAt(i)]--;
            }
            int sum = 0;
            int left = 0;
            for (int i = 0; i < has.length; i++)
            {
                if (has[i] < 0)
                {
                    sum += has[i];
                } else if (has[i] > 0)
                {
                    left += has[i];
                }
            }
            if (sum < 0)
            {
                System.out.println("No " + (-sum));
            } else
            {
                System.out.println("Yes " + left);
            }
        }
    }


}