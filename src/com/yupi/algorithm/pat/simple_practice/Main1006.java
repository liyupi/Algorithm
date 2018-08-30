package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：星际密码（水题）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1006
{

    static int[] nums = new int[10001];

    static void init(){
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i < 10001 ; i++)
        {
            nums[i] = (nums[i-1]+nums[i-2])%10000;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        init();
        while (sc.hasNext())
        {
            int n =sc.nextInt();
            while (n-->0){
                int num = sc.nextInt();
                System.out.printf("%04d",nums[num]);
            }
            System.out.println();
        }
    }

}