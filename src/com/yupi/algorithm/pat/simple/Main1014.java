package com.yupi.algorithm.pat.simple;

import java.util.Scanner;

/**
 * 功能描述：科学计数法
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1014
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String str = sc.nextLine();
            StringBuilder stringBuilder = new StringBuilder();
            int len = str.length();
            boolean positive = str.charAt(0) == '+';
            int ePos = str.indexOf('E');
            boolean left = str.charAt(ePos + 1) == '-';
            int e = Integer.parseInt(str.substring(ePos + 2));
            String subStr = str.substring(3, ePos);
            if (!left)
            {
                if (e >= subStr.length())
                {
                    stringBuilder.append(subStr);
                    int extraZero = e - subStr.length();
                    while (extraZero-- > 0)
                    {
                        stringBuilder.append(0);
                    }
                } else
                {
                    stringBuilder.append(subStr);
                    stringBuilder.insert(e, '.');
                }
                stringBuilder.insert(0, positive ? "1" : "-1");
            } else
            {
                stringBuilder.append("0.");
                while (--e > 0)
                {
                    stringBuilder.append("0");
                }
                stringBuilder.append(1 + subStr);
                stringBuilder.insert(0,positive ? "" : "-");
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
