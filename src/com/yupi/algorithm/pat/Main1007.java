package com.yupi.algorithm.pat;

import java.util.Scanner;

/**
 * 功能描述：大数A/B
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1007
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String a = sc.next();
            StringBuilder builder = new StringBuilder();
            int b = sc.nextInt();
            int left = 0;
            int num = 0;
            int len = a.length();
            for (int i = 0; i < len; i++)
            {
                num = left * 10 + (a.charAt(i)-48);
                builder.append(num / b);
                left = num % b;
            }
            if (builder.charAt(0) == '0'){
                builder.deleteCharAt(0);
            }
            System.out.println(builder.toString() + " "+left);
        }
    }
}
