import java.util.Arrays;

public class selection_sort_print_array {
    public static void main(String[] args) {
        int[] arr = { 29, 10, 14, 37, 14 };

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min_value = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_value]) {
                    min_value = j;
                }
            }
            System.out.println(Arrays.toString(arr));
            int temp = arr[i];
            arr[i] = arr[min_value];
            arr[min_value] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
