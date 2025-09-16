
import java.util.Arrays;

public class selection_sort_accending{
    public static void main(String[] args) {
        // step 1) declare an array
        int[] arr = {64, 25, 12, 22, 11};

        // step 2) length of variable
        int n = arr.length;

        // step 3) loop to interate through the array
        for(int i=0; i<arr.length; i++){
            // assume and take that arr[i] os mini value
            int mini_index = i;
            // inner loop to check 
            for(int j=i+1; j< n; j++){
                if(arr[j]< arr[mini_index]){
                    mini_index = j;
                }
                System.out.println(Arrays.toString(arr));
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[mini_index];
            arr[mini_index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}