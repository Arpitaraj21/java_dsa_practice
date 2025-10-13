
import java.util.HashMap;
import java.util.Map;

public class TwoSumBetterSolution {

    public static boolean TwoSumWithTarget(int n, int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int a = arr[i];
            int more = target - a;

            if (map.containsKey(more)) {
                return true;
            }
            map.put(a, i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        System.out.println(TwoSumWithTarget(arr.length, arr, target));
    }
}
