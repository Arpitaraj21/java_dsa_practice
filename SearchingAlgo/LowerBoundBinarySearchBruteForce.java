
public class LowerBoundBinarySearchBruteForce {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 7, 8, 9, 9, 9, 11};
        int target = 9;
        int low = 0;
        int high = arr.length - 1;

        int lowerBound = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                lowerBound = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }
        }
        System.out.println(lowerBound);
    }
}
