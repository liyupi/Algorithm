package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：卖早餐（水题）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1004
{

    static long[] nums = new long[81];

    static void init()
    {
        nums[1] = 1;
        nums[2] = 1;
        for (int i = 3; i < 81; i++)
        {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        init();
        while (sc.hasNext())
        {
            int from = sc.nextInt();
            int to = sc.nextInt();
            long sum = 0;
            for (int i = from; i <=to ; i++)
            {
                sum+=nums[i];
            }
            System.out.println(sum);
        }
    }

}