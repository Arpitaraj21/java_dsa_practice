public class PrintAllSubArrays {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1};
        int n = arr.length;

        for (int i = 0; i < n; i++) { // start index
            for (int j = i; j < n; j++) { // end index
                for (int k = i; k <= j; k++) {  // print from i to j
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}