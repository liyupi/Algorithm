package com.yupi.algorithm.pat.simple;

import java.util.Scanner;

/**
 * 功能描述：时间差
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1016
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int seconds =(int)Math.round ((end - start) / 100.0);
            int hour = 0;
            int minute = 0;
            int second = 0;
            hour = seconds/3600;
            seconds -= hour*3600;
            minute = seconds/60;
            second = seconds - minute*60;
            System.out.println((hour < 10 ? "0" : "") + hour + ":" + (minute < 10 ? "0" : "") + minute + ":" + (second < 10 ? "0" : "") + second);
        }
    }

}