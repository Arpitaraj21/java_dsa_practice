
public class optimized {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 8};

        int n = arr.length;
        int largest = arr[0];
        int smallest = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                smallest = largest;
                largest = arr[i];
            } else if (arr[i] > smallest && arr[i] != largest) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
