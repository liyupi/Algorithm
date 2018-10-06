/**
 * 功能描述：阶乘中的零
 *
 * 思路：数学规律
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class Main {

    public int trailingZeroes(int n) {
        int res = 0;
        while (n != 0) {
            n = n / 5;
            res += n;
        }
        return res;
    }

    public static void main(String[] args){
        new Main().trailingZeroes(12);
    }

}