import static java.lang.Math.max;

public class LongestSubarrayWithSumKOptimizedApproach {
    public static int LongestSubarrayWithSumK(int[] arr, int K){
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int maxLen = 0;
        int n = arr.length;
         while(right < n){
            while(left <= right && sum > K){
                sum -= arr[left];
                left++;
            }
            if(sum == K){
                maxLen = max(maxLen, right - left + 1);
            }
            right++;
            if(right < n){
                sum += arr[right];
            }
         }
         return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,3,3};
        int K= 6;
        System.out.println("Longest subarray with sum K is " + LongestSubarrayWithSumK(arr, K));
    }
}
