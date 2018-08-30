package com.yupi.algorithm.pat;

import java.util.Scanner;

/**
 * 功能描述：旧键盘打字
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1023
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String broken = sc.next();
            String input = sc.next();
            int bLen = broken.length();
            int iLen = input.length();
            boolean[] isBroken = new boolean[255];
            for (int i = 0; i < bLen; i++)
            {
                char c = broken.charAt(i);
                isBroken[c] = true;
                if (c>='A'&&c<='Z'){
                    isBroken[c+32] = true;
                }
            }
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < iLen; i++)
            {
                char c = input.charAt(i);
                if (!isBroken[c]){
                    if (c>='A'&&c<='Z'&&isBroken['+']){
                        continue;
                    } else {
                        builder.append(c);
                    }
                }
            }
            System.out.println(builder.toString());
        }
    }
}