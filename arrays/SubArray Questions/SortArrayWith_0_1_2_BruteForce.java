import java.util.Arrays;

public class SortArrayWith_0_1_2_BruteForce {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0,0,1};
        int n = arr.length;
        for(int i=0; i<n; i++){
            int mix_index = arr[0];
            for(int j=0; j<n; j++){
                if(arr[j] > arr[mix_index]){
                    mix_index = j;
                }
                int temp = arr[j];
                arr[j] = arr[mix_index];
                arr[mix_index] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
