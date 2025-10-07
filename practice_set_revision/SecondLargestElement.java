public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,3,8,6,5,4,3,2};
        int n=arr.length;

        int smallestElement = Integer.MIN_VALUE;
        int LargestElement = arr[0];

        for(int i=0; i<n; i++){
            if(arr[i] > LargestElement){
                smallestElement = LargestElement;
                LargestElement = arr[i];
            }else if(arr[i] > smallestElement && arr[i] != LargestElement ){
                smallestElement = arr[i];
            }
        }
    
        System.out.println(smallestElement);
    }
}
