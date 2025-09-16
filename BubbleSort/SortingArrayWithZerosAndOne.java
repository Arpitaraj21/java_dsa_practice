public class SortingArrayWithZerosAndOne {

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println();
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}
