/**
 * 功能描述：最长回文子串（动态规划）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class Main {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len == 0){
            return "";
        }
        int left = 0;
        int right = 0;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len - 1; i++) {
            dp[i][i] = 1;
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = 1;
                left = i;
                right = i + 1;
            }
        }
        dp[len - 1][len - 1] = 1;
        for (int l = 3; l <= len; l++) {
            for (int i = 0; i + l <= len; i++) {
                int j = i + l - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                    if (dp[i][j] == 1) {
                        left = i;
                        right = j;
                    }
                }
            }
        }
        return s.substring(left, right + 1);
    }
}