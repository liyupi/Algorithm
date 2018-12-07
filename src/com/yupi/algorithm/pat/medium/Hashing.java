package com.yupi.algorithm.pat.medium;

import java.util.Scanner;

/**
 * 功能描述：hashing
 * 思路：解决冲突应使用二次探测法！
 */

public class Hashing {

    private static boolean[] notPrime = new boolean[110 * 110];

    static void init() {
        notPrime[1] = true;
        for (int i = 2; i <= 110; i++) {
            if (!notPrime[i]) {
                int j = 2;
                int val = i * j;
                while (val <= 11000) {
                    notPrime[val] = true;
                    j++;
                    val = i * j;
                }
            }
        }
    }

    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = sc.nextInt();
        for (int i = size; i < 11000; i++) {
            if (!notPrime[i]) {
                size = i;
                break;
            }
        }
        int[] hash = new int[size];
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt() % size;
            int j, tmp = 0;
            for (j = 0; j < size; j++) {
                tmp = (val + j * j) % size;
                if (hash[tmp] == 0) {
                    break;
                }
            }
            if (j == size) {
                System.out.print("-");
            } else {
                hash[tmp] = 1;
                System.out.print(tmp);
            }
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
    }

}