
public class TwoSumBruteForce {

    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int n = arr.length;
        int target = 14;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    j++;
                } else if (arr[i] + arr[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                    break;
                }
            }
        }
    }
}
