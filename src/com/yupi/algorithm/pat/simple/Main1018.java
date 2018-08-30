package com.yupi.algorithm.pat.simple;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 功能描述：人口普查
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1018
{
    static class Person
    {
        int year;
        int month;
        int day;
        String name;

        Person(int year, int month, int day, String name)
        {
            this.year = year;
            this.month = month;
            this.day = day;
            this.name = name;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int n = sc.nextInt();
            Person[] person = new Person[n];
            int count = 0;
            for (int i = 0; i < n; i++)
            {
                String name = sc.next();
                String date = sc.next();
                int year = Integer.parseInt(date.substring(0, 4));
                int month = Integer.parseInt(date.substring(5, 7));
                int day = Integer.parseInt(date.substring(8));
                if (year > 2014 || (year == 2014 && (month > 9 || (month == 9 && day > 6))))
                {
                    continue;
                }
                if (year < 1814 || (year == 1814 && (month < 9 || (month == 9 && day < 6))))
                {
                    continue;
                }
                person[count++] = new Person(year, month, day, name);
            }
            Arrays.sort(person,0,count, (o1, o2) -> {
                if (o1.year > o2.year){
                    return 1;
                } else if(o1.year == o2.year){
                    if (o1.month>o2.month){
                        return 1;
                    } else if (o1.month == o2.month){
                        if (o1.day>o2.day){
                            return -1;
                        } else if (o1.day == o2.day){
                            return 0;
                        } else {
                            return 1;
                        }
                    } else{
                        return -1;
                    }
                } else {
                    return -1;
                }
            });
            System.out.println(count + " " + person[0].name + " " + person[--count].name);
        }
    }

}