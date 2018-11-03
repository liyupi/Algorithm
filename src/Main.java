/**
 * 功能描述：不同摩斯密码的个数
 */

public class Main {

    public int[] numberOfLines(int[] widths, String S) {
        if ("".equals(S)) {
            return new int[]{1, 0};
        }
        int len = 1;
        int pos = 0;
        for (int i = 0; i < S.length(); i++) {
            int width = widths[S.charAt(i) - 97];
            if (width + len > 100) {
                len++;
                pos = 0;
            }
            pos += width;
        }
        return new int[]{len, pos};
    }
}