package com.yupi.algorithm.pat.simple;

import java.util.Scanner;

/**
 * 功能描述：剪刀石头布
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1008
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int times = sc.nextInt();
            int[] aShow = new int[91];
            int[] bShow = new int[91];
            boolean[] hasA = new boolean[91];
            boolean[] hasB = new boolean[91];
            int aWin = 0;
            int bWin = 0;
            int all = times;
            int maxA = -1;
            int maxB = -1;
            int draw = 0;
            char maxAChar = 'B';
            char maxBChar = 'B';
            while (times-- > 0)
            {
                String a = sc.next();
                String b = sc.next();
                char aa = a.charAt(0);
                char bb = b.charAt(0);
                hasA[aa] = true;
                hasB[bb] = true;
                if (aa == 'C' && bb == 'J' || aa == 'J' && bb == 'B' || aa == 'B' && bb == 'C')
                {
                    aWin++;
                    aShow[aa]++;
                    if (aShow[aa] >= maxA)
                    {
                        if (aShow[aa] == maxA)
                        {
                            maxAChar = aa < maxAChar ? aa : maxAChar;
                            continue;
                        }
                        maxA = aShow[aa];
                        maxAChar = aa;
                    }
                } else if (aa == bb)
                {
                    draw++;
                } else
                {
                    bWin++;
                    bShow[bb]++;
                    if (bShow[bb] >= maxB)
                    {
                        maxB = bShow[bb];
                        if (bShow[bb] == maxB)
                        {
                            maxBChar = bb < maxBChar ? bb : maxBChar;
                            continue;
                        }
                        maxBChar = bb;
                    }
                }
            }
            System.out.println(aWin + " " + draw + " " + (all - aWin - draw));
            System.out.println(bWin + " " + draw + " " + (all - bWin - draw));
            System.out.println(maxAChar + " " + maxBChar);
        }
    }
}
