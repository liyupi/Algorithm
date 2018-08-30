package com.yupi.algorithm.pat.simple;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 功能描述：数字黑洞
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1009
{
    static int getNext(int num)
    {
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++)
        {
            nums[i] = num % 10;
            num /= 10;
        }
        // propagation sort
        Arrays.sort(nums);
        int min = 0;
        int max = 0;
        String zero = "";
        for (int i = 0; i < 4; i++)
        {
            min = min * 10 + nums[i];
            if (min == 0)
            {
                zero += "0";
            }
            max = max * 10 + nums[3 - i];
        }
        if (max == min)
        {
            System.out.println(max + " - " + min + " = " + "0000");
            return 6174;
        }
        int result = max - min;
        System.out.println(max + " - " + zero + min + " = " + result);
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int num = sc.nextInt();
            do
            {
                num = getNext(num);
            } while (num != 6174);
        }
    }
}
