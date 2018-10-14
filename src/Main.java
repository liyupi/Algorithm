import java.util.*;

/**
 * 功能描述：补多少括号使等式成立
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class Main {

    public int threeSumMulti(int[] A, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        long sum = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            int left = i + 1;
            int right = A.length - 1;
            while (left < right) {
                int total = A[left] + A[right] + A[i];
                if (total > target) {
                    right -= map.get(A[right]);
                } else if (total < target) {
                    left += map.get(A[left]);
                } else {
                    sum += map.get(A[left]) * map.get(A[right]);
                    left += map.get(A[left]);
                    right -= map.get(A[right]);
                    System.out.println(A[i] + ":" + A[left] + ":" + A[right]+"sum"+sum);
                }
            }
        }
        return (int) (sum % 1000000007);
    }

    public static void main(String[] args) {
        new Main().threeSumMulti(new int[]{1,1,2,2,3,3,4,4,5,5},8);
    }

    /*public int threeSumMulti2(int[] A, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        long sum = 0;
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for (int i = 0; i < list.size() - 2; i++) {
            int val1 = list.get(i);
            int left = i + 1;
            int right = list.size() - 1;
            while (left < right) {
                int val2 = list.get(left);
                int val3 = list.get(right);
                int total = val1 + val2 + val3;
                if (total > target) {
                    right--;
                } else if (total < target) {
                    left++;
                } else {
                    sum += map.get(val1) * map.get(val2) * map.get(val3);
                    left++;
                    right--;
                }
            }
        }
        return (int) (sum % 1000000007);
    }*/

}