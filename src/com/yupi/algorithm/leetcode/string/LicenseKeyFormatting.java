package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：密钥格式化
 *
 * 思路：尽量整体append，而不是按字符append
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class LicenseKeyFormatting {

    public String licenseKeyFormatting(String S, int K) {
        String[] strings = S.split("-");
        int i = S.length() - 1;
        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            builder.append(string);
        }

        StringBuilder res = new StringBuilder();
        int before = builder.length() % K;
        if (before == 0 && builder.length() >= K) {
            before = K;
        }
        res.append(builder.substring(0, before));
        for (int j = before; j < builder.length(); j += K) {
            res.append('-').append(builder.substring(j, j + K));
        }
        return res.toString().toUpperCase();
    }
}