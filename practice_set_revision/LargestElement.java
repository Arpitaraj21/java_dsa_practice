public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1,3,8,6,5,4,3,2};

        int n=arr.length;
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
