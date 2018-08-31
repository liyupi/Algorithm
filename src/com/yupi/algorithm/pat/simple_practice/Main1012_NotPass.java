package com.yupi.algorithm.pat.simple_practice;

import java.util.Scanner;

/**
 * 功能描述：分数运算
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1012_NotPass
{
    // 获得最大公约数
    static int gcd(int a, int b)
    {
        int x = b % a;
        return x == 0 ? a : gcd(x, a);
    }

    static void print(int aSon, int aMum, int bSon, int bMum, char op)
    {
        int minCommon = aMum * bMum / gcd(aMum, bMum);
        int aSon1 = aSon * minCommon / aMum;
        int bSon1 = bSon * minCommon / bMum;
        switch (op)
        {
            case '+':
                int resSonPlus = aSon1 + bSon1;
                printNum(resSonPlus, minCommon);
                break;
            case '-':
                int resSonSub = aSon1 - bSon1;
                printNum(resSonSub, minCommon);
                break;
            case '*':
                printNum(aSon * bSon, aMum * bMum);
                break;
            case '/':
                printNum(aSon * bMum, aMum * bSon);
                break;
            default:
                break;
        }
    }

    // 输入分子分母，输出格式化结果
    static void printNum(int son, int mum)
    {
        int common = gcd(Math.abs(son), Math.abs(mum));
        son /= common;
        mum /= common;
        System.out.println(son + "/" + mum);
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
            char op = sc.next().charAt(0);
            int aSon = Integer.parseInt(a.substring(0, posA));
            int aMum = Integer.parseInt(a.substring(posA + 1));
            int bSon = Integer.parseInt(b.substring(0, posB));
            int bMum = Integer.parseInt(b.substring(posB + 1));
            print(aSon, aMum, bSon, bMum, op);
        }
    }
}