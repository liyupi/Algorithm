/**
 * 功能描述：删除数组重复值
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class Main {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int len = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[len - 2]) {
                nums[len++] = nums[i];
            }
        }
        return len;
    }

    public static void main(String[] args){
        new Main().removeDuplicates(new int[]{1,1,1,2,2,3});
    }

}