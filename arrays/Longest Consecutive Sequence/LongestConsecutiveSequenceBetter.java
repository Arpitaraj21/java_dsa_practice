
import java.util.Arrays;

public class LongestConsecutiveSequenceBetter {
    public static void main(String[] args) {
        int[] arr = {100,102,100,101,101,4,4,2,3,2,1,1,1,2};
        int n = arr.length;

        Arrays.sort(arr);

        int longest = 1;
        int count = 0;
        int lastSmallest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] - 1 == lastSmallest){
                count = count+1;
                lastSmallest = arr[i];
            }
            else if(arr[i] != lastSmallest){
                count = 1;
                lastSmallest = arr[i];
            }
            longest = Math.max(longest, count);
        }
        System.out.println(longest);
    }
}
