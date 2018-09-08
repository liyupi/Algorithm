package com.yupi.algorithm.pat.simple_practice;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 功能描述：遍历边长
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1027 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            BigInteger m = new BigInteger(sc.next());
            BigInteger n = new BigInteger(sc.next());
            String sum = m.multiply(n).toString();
            if (sum.charAt(sum.length() - 1) % 2 == 0) {
                System.out.println(sum+".00");
            } else {
                System.out.println(sum + ".41");
            }
        }
    }
}