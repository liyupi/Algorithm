import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：和为某值的子数组
 * <p>
 * 思路：map存储之前的子数组和，利用差得到解（如0-5的和减0-3的和为子数组4-5）
 */

public class Main {

    int min = Integer.MAX_VALUE;

    Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

    public int minFallingPathSum(int[][] A) {
        for (int i = 0; i < A[0].length; i++) {
            dfs(A, 0, i, 0);
        }
        return min;
    }

    private int dfs(int[][] A, int i, int j, int sum) {
        if (i == A.length) {
            min = Math.min(sum, min);
            return 0;
        }
        for (int k = j - 1; k <= j + 1; k++) {
            if (k >= 0 && k < A[i].length) {
                if (map.containsKey(i + 1) && map.get(i + 1).containsKey(k)) {
                    min = Math.min(sum + map.get(i + 1).get(k), min);
                } else {
                    int partSum = dfs(A, i + 1, k, sum + A[i][k]) + A[i][k];
                    if (!map.containsKey(i)) {
                        map.put(i, new HashMap<>());
                    }
                    map.get(i).put(j, partSum);
                }
            }
        }
        return A[i][j];
    }
}