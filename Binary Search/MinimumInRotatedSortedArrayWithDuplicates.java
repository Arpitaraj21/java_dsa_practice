public class MinimumInRotatedSortedArrayWithDuplicates {
    public static int MinimumInRotatedArray(int[] arr){
        int low =0;
        int high = arr.length - 1;

        int MinVal = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low = low + 1;
                high = high - 1;
                continue;
            }

            if(arr[low] <= arr[high]){
                MinVal = Math.min(MinVal, arr[low]);
                break;
            }

            if(arr[low] <= arr[mid]){
                MinVal = Math.min(MinVal, arr[low]);
                low = mid+1;
            }
            else{
                MinVal = Math.min(MinVal, arr[mid]);
                high = mid - 1;
            }
                }
        return MinVal;
    }
    public static void main(String[] args) {
        int[] arr= {7,8,1,2,3,3,3,4,5,6};
        System.out.println(MinimumInRotatedArray(arr));
    }
}
