import java.util.Arrays;

public class selection_sort_decending {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        int n = arr.length;

        for(int i=0; i<n; i++){
            int max_index = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] > arr[max_index]){
                    max_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}