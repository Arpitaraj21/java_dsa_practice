import java.util.Arrays;

public class LeftRotateByDPlaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int d = 3;

        d = d % n;
        System.out.println("value of d" + d);
        int[] temp = new int[d];

        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }
        System.out.println("temp" + Arrays.toString(temp));
        for(int i = d; i<n; i++){
            arr[i-d] = arr[i];
        }

        int j =0;
        for(int i=n-d; i<n; i++){
            arr[n-i] = temp[j];
            j++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
