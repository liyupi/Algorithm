/**
 * 功能描述：有效的完全平方数
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().isPerfectSquare(808201));
    }

    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long left = 1;
        long right = num / 2;
        while (left <= right) {
            long middle = left + (right - left) / 2;
            long sum = middle * middle;
            if (sum == num) {
                return true;
            } else if (sum < num) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }
}