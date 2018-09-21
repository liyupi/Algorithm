import java.util.*;

/**
 * 功能描述：支持常数时间插入、删除、随机访问操作的数据结构
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class Main {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i)){
                set2.add(i);
            }
        }
        int[] array = new int[set2.size()];
        int index = 0;
        for (Integer integer : set2) {
            array[index++] = integer;
        }
        return array;
    }
}