public class NumberOfRotation {
    public static int NumberOfRotationInSortedArray(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        int minValue = Integer.MAX_VALUE;
        int index = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[low] <= arr[high]){
                if(arr[low] < minValue){
                    minValue = arr[low];
                    index = low;
                }
                break;
            }

            if(arr[low] <= arr[mid]){
                if(arr[low] < minValue){
                    minValue = arr[low];
                    index = low;
                }
                low = mid + 1;
            }

            else{
                if(arr[mid] < minValue){
                    minValue = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,1,2};
        System.out.println("the number of times the array has been rotated : " + NumberOfRotationInSortedArray(arr));
    }
}
