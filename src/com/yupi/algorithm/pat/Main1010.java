package com.yupi.algorithm.pat;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 功能描述：月饼（水题）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1010
{
    static class Item
    {
        int num;
        double aver;
        int total;

        Item(int num)
        {
            this.num = num;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int num = sc.nextInt();
            int need = sc.nextInt();
            Item[] items = new Item[num];
            for (int i = 0; i < num; i++)
            {
                int val = sc.nextInt();
                items[i] = new Item(val);
            }
            for (int i = 0; i < num; i++)
            {
                int val = sc.nextInt();
                items[i].aver = (double) val / items[i].num;
                items[i].total = val;
            }
            Arrays.sort(items, (o1, o2) -> {
                if (o1.aver > o2.aver)
                {
                    return -1;
                } else if (o1.aver < o2.aver)
                {
                    return 1;
                } else
                {
                    return 0;
                }
            });
            double result = 0;
            for (int i = 0; i < num; i++)
            {
                if (need > items[i].num)
                {
                    need -= items[i].num;
                    result += items[i].total;
                } else
                {
                    result += items[i].aver * need;
                    break;
                }
            }
            System.out.printf("%.2f",result);
        }
    }
}
