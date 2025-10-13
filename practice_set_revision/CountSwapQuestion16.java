
public class CountSwapQuestion16 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 8, 7, 6};
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }
        System.out.println("Number of swap: " + count);
    }
}
