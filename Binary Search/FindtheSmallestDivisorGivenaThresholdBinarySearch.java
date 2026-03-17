public class FindtheSmallestDivisorGivenaThresholdBinarySearch{
    static int SmallestDivisorGivenaThresholdBinarySearch(int[] arr, int k){
        int max = 0;
        for(int m: arr){
            max = Math.max(max, m);
        }

        int low = 1;
        int high = max;
        while(low <= high){
            int mid = (low + high)/ 2;
            int count = 0;

            for(int num: arr){
                count += (num + mid - 1) / mid;
            }
            
            if(count > k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }

        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int k=6;
        System.out.println(SmallestDivisorGivenaThresholdBinarySearch(arr, k));
    }
}
