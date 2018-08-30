package com.yupi.algorithm.pat;

import java.util.Scanner;

/**
 * 功能描述：有理数和差商积
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1024
{
    // 获得最大公约数
    static int gcd(int a, int b)
    {
        if (a < b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }

    static void print(int aSon, int aMum, int bSon, int bMum)
    {
        if (bSon != 0)
        {
            int minCommon = aMum * bMum / gcd(aMum, bMum);
            int aSon1 = aSon * minCommon / aMum;
            int bSon1 = bSon * minCommon / bMum;
            int resSonPlus = aSon1 + bSon1;
            int resSonSub = aSon1 - bSon1;
            String aNum = printNum(aSon, aMum);
            String bNum = printNum(bSon, bMum);
            // 加
            System.out.println(aNum + " + " + bNum + " = " + printNum(resSonPlus, minCommon));
            // 减
            System.out.println(aNum + " - " + bNum + " = " + printNum(resSonSub, minCommon));
            // 乘
            System.out.println(aNum + " * " + bNum + " = " + printNum(aSon * bSon, aMum * bMum));
            // 除
            System.out.println(aNum + " / " + bNum + " = " + printNum(aSon * bMum, aMum * bSon));
        } else
        {
            String aNum = printNum(aSon, aMum);
            // 加
            System.out.println(aNum + " + 0 = " + aNum);
            // 减
            System.out.println(aNum + " - 0 = " + aNum);
            // 乘
            System.out.println(aNum + " * 0 = 0");
            // 除
            System.out.println(aNum + " / 0 = Inf");
        }
    }

    // 输入分子分母，输出格式化结果
    static String printNum(int son, int mum)
    {
        boolean negative = false;
        negative = son < 0 ^ mum < 0;
        if (son < 0)
        {
            son = -son;
        }
        if (mum < 0)
        {
            mum = -mum;
        }
        int common = gcd(son, mum);
        son /= common;
        mum /= common;
        int more = son / mum;
        int left = son % mum;
        if (more == 0)
        {
            if (left == 0)
            {
                return "0";
            } else
            {
                return (negative ? "(-" : "") + left + "/" + mum + (negative ? ")" : "");
            }
        } else
        {
            if (left == 0)
            {
                return (negative ? "(-" : "") + more + (negative ? ")" : "");
            } else
            {
                return (negative ? "(-" : "") + more + " " + left + "/" + mum + (negative ? ")" : "");
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String a = sc.next();
            String b = sc.next();
            int posA = a.indexOf('/');
            int posB = b.indexOf('/');
            int aSon = Integer.parseInt(a.substring(0, posA));
            int aMum = Integer.parseInt(a.substring(posA + 1));
            int bSon = Integer.parseInt(b.substring(0, posB));
            int bMum = Integer.parseInt(b.substring(posB + 1));
            print(aSon, aMum, bSon, bMum);
        }
    }
}