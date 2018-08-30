package com.yupi.algorithm.pat;

import java.util.Scanner;

/**
 * 功能描述：换货币（水题）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1027
{
    static int getAll(int[] coins)
    {
        return coins[0] * 17 * 29 + coins[1] * 29 + coins[2];
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String p = sc.next();
            String a = sc.next();
            int[] pCoin = new int[3];
            int[] aCoin = new int[3];
            String[] pCoinStr = p.split("\\.");
            String[] aCoinStr = a.split("\\.");
            for (int i = 0; i < 3; i++)
            {
                pCoin[i] = Integer.parseInt(pCoinStr[i]);
                aCoin[i] = Integer.parseInt(aCoinStr[i]);
            }
            int res = getAll(aCoin) - getAll(pCoin);
            boolean negative = false;
            if (res<0){
                res = -res;
                negative = true;
            }
            int g = res / (17 * 29);
            res = res % (17 * 29);
            int s = res / 29;
            res = res % 29;
            System.out.print((negative ? "-" : "") + g + "." + s + "." + res);
        }
    }


}