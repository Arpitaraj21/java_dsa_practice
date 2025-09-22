
public class floating_selectionsort {

    public static void main(String[] args) {
        float[] arr = {12.31f, 34.45f, 23.2f, 56.13f};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            float temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        System.out.println("sorted array: ");
        for (float num : arr) {
            System.out.print(num + " ");
        }
    }
}
