import java.util.ArrayList;

public class LeaderInArrayBruteForce {
    public static void main(String[] args) {
        int[] arr = { 10, 22, 12, 3, 0, 6 };
        int n = arr.length;

        ArrayList<Integer> leaders = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                leaders.add(arr[i]);
            }
        }

        for (int num : leaders) {
            System.out.println(num);
        }
    }
}