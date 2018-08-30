package com.yupi.algorithm.pat;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 功能描述：插入与归并
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1025
{
    static void isInsertion(int[] origin, int[] middle)
    {
        int i = 0;
        while (i < middle.length - 1 && middle[i + 1] >= middle[i])
        {
            i++;
        }
        int pos = i + 1;
        while (++i < middle.length)
        {
            if (origin[i] != middle[i])
            {
                merge(middle, i);
                return;
            }
        }
        insertion(middle, pos);
    }

    // 插入排序
    private static void insertion(int[] middle, int pos)
    {
        System.out.println("Insertion Sort");
        int val = middle[pos];
        for (int i = pos; i >= 1; i--)
        {
            if (val < middle[i - 1])
            {
                middle[i] = middle[i - 1];
                middle[i - 1] = val;
            } else
            {
                break;
            }
        }
    }

    // 归并排序
    private static void merge(int[] middle, int pos)
    {
        System.out.println("Merge Sort");
        int len = middle.length;
        int[] prev = Arrays.copyOf(middle, len);
        // 判定规模
        if (len < 2 * pos)
        {
            pos *= 2;
            Arrays.sort(middle, 0, pos - 1);
        } else
        {
            boolean stop = false;
            for (int i = 0; i < len; i += pos)
            {
                int next = i + pos > len ? len : i + pos;
                Arrays.sort(middle, i, next);
                if (!Arrays.equals(middle, prev))
                {
                    stop = true;
                }
            }
            if (!stop){
                Arrays.sort(middle, 0, pos*2);
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int n = sc.nextInt();
            int[] origin = new int[n];
            int[] res = new int[n];
            int[] middle = new int[n];
            for (int i = 0; i < n; i++)
            {
                origin[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++)
            {
                middle[i] = sc.nextInt();
            }
            isInsertion(origin, middle);
            for (int i = 0; i < middle.length - 1; i++)
            {
                System.out.print(middle[i] + " ");
            }
            System.out.println(middle[middle.length - 1]);
        }
    }


}