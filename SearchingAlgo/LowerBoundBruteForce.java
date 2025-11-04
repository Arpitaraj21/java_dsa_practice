
public class LowerBoundBruteForce {

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 8, 8, 15, 19};
        int target = 8;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= target) {
                System.out.println(i + "  " + arr[i] + "  value");
                break;
            }
        }
    }
}
