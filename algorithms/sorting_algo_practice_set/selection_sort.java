import java.util.Arrays;

public class selection_sort{
    public static void main(String[] args) {
        int[] arr = {65,22,98,72,45,76};

        int n = arr.length;
        for(int i=0; i<n; i++){
            int min_index = i;
            for(int j=i+1; j<n-1; j++){
                if(arr[j] < arr[min_index]){
                    int temp = arr[j];
                    arr[j] = arr[min_index];
                    arr[min_index] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}