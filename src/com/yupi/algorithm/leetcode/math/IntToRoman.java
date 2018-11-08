package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：整数转罗马数字
 */

public class IntToRoman {

    public String intToRoman(int num) {
        String str = "IVXLCDM";
        StringBuilder res = new StringBuilder();
        int pos = 0;
        while (num != 0) {
            int left = num % 10;
            char c = str.charAt(pos * 2);
            StringBuilder temp = new StringBuilder();
            if (left == 9) {
                temp.append(c).append(str.charAt(pos * 2 + 2));
                left -= 9;
            }
            if (left >= 5) {
                temp.append(str.charAt(pos * 2 + 1));
                left -= 5;
            }
            if (left == 4) {
                temp.append(c).append(str.charAt(pos * 2 + 1));
                left -= 4;
            }
            while (left-- > 0) {
                temp.append(c);
            }
            res.insert(0, temp);
            num /= 10;
            pos++;
        }
        return res.toString();
    }

}