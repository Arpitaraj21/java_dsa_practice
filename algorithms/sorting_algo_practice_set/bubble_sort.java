import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = { 65, 22, 98, 72, 45, 76 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for(int j=0; j < n - i - 1 ; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
