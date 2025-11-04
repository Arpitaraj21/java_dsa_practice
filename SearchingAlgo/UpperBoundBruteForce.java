
public class UpperBoundBruteForce {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 7, 8, 9, 9, 9, 11};
        int target = 9;

        int low = 0;
        int high = arr.length - 1;

        int upperBound = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                upperBound = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(upperBound);
    }
}
