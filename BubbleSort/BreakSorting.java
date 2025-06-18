public class BreakSorting {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4 };

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
            }
            count++;
            if (!isSwapped) {
                break;
            }
        }
        System.out.println();
        System.out.print(count);
        System.out.println();
    }
}
