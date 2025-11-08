
public class BinarySearchAlgo {

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                System.out.println("index is " + mid);
                break;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }
}
