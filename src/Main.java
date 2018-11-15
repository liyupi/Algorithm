import java.util.Arrays;

/**
 * 功能描述：矩阵置零
 * <p>
 * 思路：题目要求使用常数空间，原地交换。因此我们只能利用原数组的空间
 * 可以用首行首列存储某一行某一列是否为0（本来首行或首列也要赋值为0）
 * 注意一种情况：首行/首列本来没0，但是置换后出现了0，会错误，因此需要两个条件判断首行首列原本是否包含0
 */

public class Main {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int left = 0;
        int right = matrix.length - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (matrix[middle][0] > target) {
                right = middle - 1;
            } else if (matrix[middle][0] < target) {
                left = middle;
            } else {
                return true;
            }
        }
        return binarySearch(matrix[left], target);
    }

    public boolean binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (array[middle] > target) {
                right = middle - 1;
            } else if (array[middle] < target) {
                left = middle;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new Main().searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}}, 13);
    }
}