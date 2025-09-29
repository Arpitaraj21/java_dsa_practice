import java.util.Arrays;

public class leftRotateArrayByDplacesBruteForce {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int d = 3;
        int[] temp = new int [d];

        // storing the value from original array to a temp variable;
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }

        for(int i=d; i<n; i++){
            arr[i-d] = arr[i];
        }
        int j=0;
        for(int i=n-d; i<n; i++){
            arr[i] = temp[j];
            j++;
        }

System.out.println(Arrays.toString(temp));
System.out.println(Arrays.toString(arr));
    }
}
