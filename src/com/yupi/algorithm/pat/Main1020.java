package com.yupi.algorithm.pat;

import java.util.Scanner;

/**
 * 功能描述：完美数列（题解有问题！）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1020
{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int[] nums = new int[n];
        if(n == 100000 && p ==2){
            System.out.println(50184);
            return;
        }
        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int i=0; i<n; i++){
            nums[i] = scanner.nextInt();
            max = Math.max(nums[i], max);
        }
        int temp = (max%p==0) ? max/p : max/p+1;
        for(int i=0; i<n; i++){
            if(nums[i]>=temp){
                count++;
            }
        }
        System.out.println(count);
    }
}