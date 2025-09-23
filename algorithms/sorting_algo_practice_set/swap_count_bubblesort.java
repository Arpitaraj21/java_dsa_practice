
import java.util.Arrays;

public class swap_count_bubblesort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 8, 2, 4};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
