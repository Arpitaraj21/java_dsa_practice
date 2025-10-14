
import java.util.Arrays;

public class TwoSumOptimizedApproach {
    public static int[] TwoSum(int n, int[] arr, int target){
        int left = 0;
        int right = n-1;

        while(left <= right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[] {left, right};
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,11};
        int target = 14;
        System.out.println(Arrays.toString(TwoSum(arr.length, arr, target)));
    }
}
