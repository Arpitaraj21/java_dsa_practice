import java.util.Arrays;

public class MoveZerosOptimizedApproach {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0};
        int n=arr.length;
        int left = 0;

        for(int right = 0; right<n; right++){
            if(arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
