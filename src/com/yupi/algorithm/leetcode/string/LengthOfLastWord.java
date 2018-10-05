package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：最后一个单词的长度
 *
 * 注意陷阱：如"aaa   "
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int len = s.length();
        boolean first = true;
        int pos = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (first && s.charAt(i) != ' ') {
                first = false;
                pos = i + 1;
            }
            if (!first && s.charAt(i) == ' ') {
                return pos - i - 1;
            }
        }
        return pos;
    }

    public static void main(String[] args){
        System.out.println(new LengthOfLastWord().lengthOfLastWord(" "));
    }

}