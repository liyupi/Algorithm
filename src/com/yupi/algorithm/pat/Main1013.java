package com.yupi.algorithm.pat;

import java.util.Scanner;

/**
 * 功能描述：组个最小数
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1013
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            StringBuilder stringBuilder = new StringBuilder();
            int zero = 0;
            boolean first = true;
            for (int i = 0; i < 10; i++)
            {
                int val = sc.nextInt();
                if (i == 0){
                    zero = val;
                    continue;
                }
                if (first && val > 0){
                    stringBuilder.append(i);
                    while (zero-->0){
                        stringBuilder.append(0);
                    }
                    first = false;
                    while (--val>0){
                        stringBuilder.append(i);
                    }
                    continue;
                }
                while (val-->0){
                    stringBuilder.append(i);
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
