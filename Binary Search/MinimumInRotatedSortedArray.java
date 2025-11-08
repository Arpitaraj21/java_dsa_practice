public class MinimumInRotatedSortedArray {
    public static int MinimumSortedArray(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        int minValue = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low)/2;

            // If current segment is already sorted
            if(arr[low] <= arr[high]){
                minValue = Math.min(minValue, arr[low]);
                break;
            }

            if(arr[low] <= arr[mid]){
                minValue = Math.min(minValue, arr[low]);
                low = mid + 1;

            }
            else{
                minValue = Math.min(minValue, arr[mid]);
                high = mid - 1;
            }
        }
        return minValue;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(MinimumSortedArray(arr));
    }
}
