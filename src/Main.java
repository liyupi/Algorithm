/**
 * 功能描述：元音字母字串反转
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().reverseVowels("leetcode"));
    }

    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            int findI = "aeiouAEIOU".indexOf(chars[i]);
            if (findI == -1) {
                i++;
                continue;
            }
            int findJ = "aeiouAEIOU".indexOf(chars[j]);
            if (findJ == -1) {
                j--;
            } else {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(chars);
    }
}