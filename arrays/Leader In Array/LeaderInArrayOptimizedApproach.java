public class LeaderInArrayOptimizedApproach {
    public static void main(String[] args) {
        int[] arr = { 10, 22, 12, 3, 0, 6 };
        int n = arr.length;
        int maxEle = arr[n-1];

        for(int i=n-1; i>=0; i--){
            // System.out.println(arr[n]);
            if(maxEle <= arr[i]){
                System.out.print(arr[i] + " ");
                maxEle = arr[i];
            }
        }
    }
}
