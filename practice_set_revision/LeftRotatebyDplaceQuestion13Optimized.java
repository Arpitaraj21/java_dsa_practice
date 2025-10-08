import java.util.Arrays;

public class LeftRotatebyDplaceQuestion13Optimized {
    public static void rotate(int[] arr, int l, int r){
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int d = 3;
        rotate(arr, 0, d-1);
        rotate(arr, d, n-1);
        rotate(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));

    }
}
