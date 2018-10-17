/**
 * 功能描述：最长特殊子序列I
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class Main {

    public int findLUSlength(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if (lenA > lenB) {
            return lenA;
        } else if(lenA < lenB) {
            return lenB;
        } else if (a.equals(b)) {
            return 0;
        } else {
            return lenA;
        }
    }

}