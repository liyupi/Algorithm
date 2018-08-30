package com.yupi.algorithm.pat.simple;

import java.util.Scanner;

/**
 * 功能描述：约会密码
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1004
{

    static char[] getCommon(String a, String b)
    {
        char[] chars = new char[2];
        int aLen = a.length();
        int bLen = b.length();
        int i = 0;
        boolean first = true;
        while (i < aLen && i < bLen)
        {
            char aa = a.charAt(i);
            char bb = b.charAt(i);
            if (first)
            {
                if (aa >= 'A' && aa <= 'Z' && bb >= 'A' && bb <= 'Z' && aa == bb)
                {
                    chars[0] = aa;
                    first = false;
                }
            } else
            {
                if (aa == bb)
                {
                    chars[1] = aa;
                    break;
                }
            }
            i++;
        }
        return chars;
    }

    static int getSamePos(String c, String d)
    {
        int cLen = c.length();
        int dLen = d.length();
        int i = 0;
        while (i < cLen && i < dLen)
        {
            char a = c.charAt(i);
            char b = d.charAt(i);
            if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z')
            {
            } else
            {
                i++;
                continue;
            }
            if (a == b)
            {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            char[] chars = getCommon(a, b);
            int pos = getSamePos(c, d);
            String posStr;
            if (pos < 10)
            {
                posStr = "0" + pos;
            } else
            {
                posStr = String.valueOf(pos);
            }
            int hour;
            String hourStr;
            if (chars[1] >= '0' && chars[1] <= '9')
            {
                hour = chars[1] - 48;
                hourStr = "0" + hour;
            } else
            {
                hour = chars[1] - 64 + 9;
                hourStr = String.valueOf(hour);
            }
            String[] dates = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
            System.out.println(dates[chars[0] - 65] + " " + hourStr + ":" + posStr);
        }
    }
}
