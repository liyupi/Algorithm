package com.yupi.algorithm.pat.simple_practice;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 功能描述：能否组成三角形（大数边）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main1025 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger c = new BigInteger(sc.next());
            if (a.add(b).compareTo(c) > 0 && b.add(c).compareTo(a) > 0 && a.add(c).compareTo(b) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}