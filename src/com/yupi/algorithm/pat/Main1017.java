package com.yupi.algorithm.pat;

import java.util.Scanner;

/**
 * 功能描述：沙漏
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1017
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int val = sc.nextInt();
            char symbol = sc.next().charAt(0);
            int n = (int) Math.sqrt((val + 1) / 2);
            int size = 2 * n - 1;
            for (int i = 0; i < size; i++)
            {
                for (int j = 0;j<size;j++){
                    if (i<=size/2&&j<=size/2){
                        if (i<=j){
                            System.out.print(symbol);
                        } else {
                            System.out.print(" ");
                        }
                    } else if (i<=size/2&&j>size/2){
                        if (i<size-j){
                            System.out.print(symbol);
                        } else {
                            System.out.print(" ");
                        }
                    } else if(i>size/2&&j<=size/2){
                        if (i+1>=size-j){
                            System.out.print(symbol);
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if (i>=j){
                            System.out.print(symbol);
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
            System.out.println(val-2*n*n+1);
        }
    }

}