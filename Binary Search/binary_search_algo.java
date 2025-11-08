public class binary_search_algo{
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,9,12,16,17};
        int n = arr.length;
        int target = 13;

        int low = 0;
        int high = n-1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
             if(arr[mid] == target ){
                System.out.println(mid);
                return;
             }
             else if(arr[mid] > target){
                high = mid - 1;
             }
             else{
                low = mid + 1;
             }
        }
        System.out.println( low + (high - low)/2);
    }
}