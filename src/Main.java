import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 功能描述：每层节点向右连接-非完全二叉树（迭代和递归）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target > nums[middle]) {
                left = middle + 1;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }


}