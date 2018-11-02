package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：旋转字符串
 * 思路：如果B是由A旋转而得，则B + B一定包含A
 */

public class RotateString {

/*    public boolean rotateString(String A, String B) {
        StringBuilder sb = new StringBuilder(A);
        int len = A.length();
        for (int i = 0; i < len; i++) {
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
            if (sb.toString().equals(B)) {
                return true;
            }
        }
        return false;
    }*/

    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (B + B).contains(A);
    }

}