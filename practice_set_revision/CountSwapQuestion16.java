public class CountSwapQuestion16{
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3,6};
        int n = arr.length;

        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}