package com.yupi.algorithm.pat;

import java.util.Scanner;

/**
 * 功能描述：统计个位（水题）
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
            String s = sc.nextLine();
            int len = s.length();
            int[] nums = new int[10];
            for (int i = 0; i < len; i++)
            {
                nums[s.charAt(i)-48]++;
            }
            for (int i = 0; i < nums.length; i++)
            {
                if (nums[i] > 0)
                {
                    System.out.println(i + ":" + nums[i]);
                }
            }
        }
    }
}
