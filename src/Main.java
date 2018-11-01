/**
 * 功能描述：二进制表示中质数个计算置位
 * <p>
 * 思路：将素数打表，遍历从L到R，依次判断其计算置位数（二进制该为1）是否为素数
 * 小技巧：Integer.bitCount(num); Long.bitCount(num); new BigInteger().bitCount()都能统计计算置位数;
 */

public class Main {

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (matrix[i + 1][j + 1] != matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}