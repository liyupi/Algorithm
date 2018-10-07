/**
 * 功能描述：模拟求和
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class Main {

    public int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getSum(a ^ b, (a & b) << 1);
    }

}