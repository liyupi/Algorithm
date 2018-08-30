package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：斐波那契凤尾
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1005
{

    static int[] nums = new int[100001];

    static void init(){
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i < 100001 ; i++)
        {
            nums[i] = (nums[i-1]+nums[i-2])%1000000;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        init();
        while (sc.hasNext())
        {
            int n =sc.nextInt();
            if (n>=37){
                System.out.printf("%06d\n",nums[n]);
            }else{
                System.out.println(nums[n]);
            }
        }
    }

}