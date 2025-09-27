public class modified_bubblesort {
    public static void main(String[] args) {
        int[] arr = { 65, 22, 98, 72, 45, 76 };
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    count++;
                }
            }
            if (!swapped) {
                break;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("count is : " + count);
    }
}