package com.yupi.algorithm.pat.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 功能描述：坏键盘
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1019
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String str = sc.nextLine();
            String fact = sc.nextLine();
            str = str.toUpperCase();
            fact = fact.toUpperCase();
            int lenS = str.length();
            int lenF = fact.length();
            List<Character> list = new ArrayList<>();
            int i = 0;
            int j = 0;
            while (i < lenS && j < lenF)
            {
                if (list.contains(str.charAt(i)))
                {
                    i++;
                    continue;
                }
                if (str.charAt(i) != fact.charAt(j))
                {
                    list.add(str.charAt(i));
                    i++;
                } else
                {
                    i++;
                    j++;
                }
            }
            while (i < lenS)
            {
                if (!list.contains(str.charAt(i)))
                {
                    list.add(str.charAt(i));
                }
                i++;
            }
            for (Character character : list)
            {
                System.out.print(character);
            }
            System.out.println();
        }
    }

}