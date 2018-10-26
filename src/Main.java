/**
 * 功能描述：非递减数列
 */

public class Main {

    public boolean checkPossibility(int[] nums) {
        if (nums.length < 2) {
            return true;
        }
        int num = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                num++;
                if (num > 1) {
                    return false;
                }
                if (i != 1 && nums[i - 2] > nums[i]) {
                    if (i + 1 != nums.length && nums[i + 1] < nums[i - 1]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}