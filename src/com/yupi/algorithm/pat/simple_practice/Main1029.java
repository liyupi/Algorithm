package com.yupi.algorithm.pat.simple_practice;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 功能描述：某年不吉利月份
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1029 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            StringBuilder stringBuilder = new StringBuilder();
            Calendar calendar = Calendar.getInstance();
            for (int i = 0; i < 12; i++) {
                calendar.set(n,i,13);
                if (calendar.get(Calendar.DAY_OF_WEEK) == 6){
                    stringBuilder.append(i+1+" ");
                }
            }
            if (stringBuilder.length() == 0){
                System.out.println("Luck");
            } else {
                System.out.println(stringBuilder.substring(0,stringBuilder.length()-1));
            }
        }
    }
}