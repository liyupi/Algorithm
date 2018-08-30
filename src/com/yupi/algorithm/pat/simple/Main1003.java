package com.yupi.algorithm.pat.simple;

import java.util.Scanner;

/**
 * 功能描述：输出素数
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1003
{
    static int max = 150000;
    static boolean[] notSu = new boolean[max];
    static int[] su = new int[20000];

    static void init()
    {
        int count = 1;
        notSu[1] = true;
        int i = 2;
        while (i < max)
        {
            if (notSu[i])
            {
                i++;
                continue;
            }
            su[count++] = i;
            for (int k = 2; k < max; k++)
            {
                int val = i * k;
                if (val >= max)
                {
                    break;
                }
                notSu[val] = true;
            }
            i++;
        }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        init();
        while (sc.hasNextInt())
        {
            int left = sc.nextInt();
            int right = sc.nextInt();
            for (int i = left; i <= right; i++)
            {
                if ((i-left)%10 == 9 || i == right){
                    System.out.println(su[i]);
                } else{
                    System.out.print(su[i] + " ");
                }
            }
        }
    }
}
