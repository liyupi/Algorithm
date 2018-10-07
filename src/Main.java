/**
 * 功能描述：各位相加
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class Main {

    public int addDigits(int num) {
        if(num < 10) {
            return num;
        }
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);
    }

}