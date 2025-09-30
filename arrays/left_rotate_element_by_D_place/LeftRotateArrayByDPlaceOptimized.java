import java.util.Arrays;

public class LeftRotateArrayByDPlaceOptimized {
    public static void main(String[] args) {
        int[] arr = {1,2, 3,4, 5,6,7,8};
        int d = 3;
        int n = arr.length;
        int [] temp = new int [d];

        for(int i=0; i<d; i++){
         temp[i] = arr[i];
        }

        for(int i=d; i<n; i++){
            arr[i-d] = arr[i];
        }

        for(int i=n-d; i<n; i++){
            arr[i] = temp[i-(n-d)];
        }
        System.out.println(Arrays.toString(arr));
    }
}
