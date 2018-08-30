package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：走台阶（DP）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1008
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            long[] dp = new long[n+1];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }
            System.out.println(dp[n]);
        }
    }

}