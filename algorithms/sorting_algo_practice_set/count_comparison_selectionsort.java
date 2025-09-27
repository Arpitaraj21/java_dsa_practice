
import java.util.Arrays;

public class count_comparison_selectionsort {

    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 2, 9, 1, 6, 23, 31, 3};

        int n = arr.length;
        int comparison = 0;

        for (int i = 0; i < n; i++) {
            int min_index = i;
            comparison++;
            for (int j = 0; j < n; j++) {
                if (arr[min_index] < arr[j]) {
                    int temp = arr[min_index];
                    arr[min_index] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(comparison);
    }
}
