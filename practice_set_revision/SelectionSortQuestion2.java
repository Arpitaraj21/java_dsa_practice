
import java.util.Arrays;

public class SelectionSortQuestion2 {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5,2};
        int n = arr.length;

        for(int i=0; i<n; i++){
            int min_index = i;
            for(int j=0; j<n; j++){
                if(arr[j] > arr[min_index]){
                    min_index = j;
                }

                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
