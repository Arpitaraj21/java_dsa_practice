
import java.util.*;

public class LongestSubarrayWithSumKHashingApproach{

    public static void main(String[] args) {
        int[] arr= {1,2,3,1,1,1,1,4,2,3};
        int K = 3;
        System.out.println("The longest subarray with sum K is : " + LongestSubarrayWithSumK(arr, K));
    }
    
    public static int LongestSubarrayWithSumK(int[] arr, int K){
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(sum == K)
               maxLen = Math.max(maxLen, i+1);

            int remaining = sum - K;

            if(preSumMap.containsKey(remaining)){
                int len = i - preSumMap.get(remaining);
                maxLen = Math.max(maxLen, len);
            }

            if(!preSumMap.containsKey(remaining)){
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }
}