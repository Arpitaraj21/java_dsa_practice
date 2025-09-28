import java.util.Arrays;

public class bruteforce {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12,0};
        int n = arr.length;

        int[] temp = new int[n];
        int j = 0;

        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                temp[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
