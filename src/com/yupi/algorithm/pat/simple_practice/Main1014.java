package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：求正整数因子个数
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1014 {

    static int[] nums = new int[100001];

    static void init(){
        for (int i = 2; i <= 100000; i++) {
            if (nums[i] == 0){
                nums[i] = 1;
                for (int j = 2 * i; j <= 100000; j += i) {
                    nums[j]++;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        init();
        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(nums[n]);
        }
    }
}