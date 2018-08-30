package com.yupi.algorithm.pat.simple;

import java.util.Scanner;

/**
 * 功能描述：有几个PAT
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1030
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String str = sc.nextLine();
            // count0表示p的个数，count1表示每个a前的p的个数的和，即遇到t加上count1
            long[] counts = new long[2];
            int len = str.length();
            long sum = 0;
            for (int i = 0; i < len; i++)
            {
                char c = str.charAt(i);
                switch (c)
                {
                    case 'P':
                        counts[0]++;
                        break;
                    case 'A':
                        counts[1] += counts[0];
                        break;
                    case 'T':
                        sum += counts[1]%1000000007;
                        break;
                    default:
                        break;
                }
            }
            System.out.println(sum%1000000007);
        }
    }


}