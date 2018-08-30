package com.yupi.algorithm.pat;

import java.util.Scanner;

/**
 * 功能描述：统计同成绩学生（水题）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1028
{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int[] nums = new int[100001];
            int n = sc.nextInt();
            for (int i = 0; i < n; i++)
            {
                nums[sc.nextInt()]++;
            }
            int n2 = sc.nextInt();
            for (int i = 0; i < n2-1; i++)
            {
                System.out.print(nums[sc.nextInt()]+" ");
            }
            System.out.println(nums[sc.nextInt()]);
        }
    }


}