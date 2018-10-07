/**
 * 功能描述：丑数
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class Main {

    public boolean isUgly(int num) {
        if (num < 1) {
            return false;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }

}