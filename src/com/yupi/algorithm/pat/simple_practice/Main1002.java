package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：new Coder 数列判3的倍数（水题）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1002
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
           int n = sc.nextInt();
            if ((n-2)%4==0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }


}