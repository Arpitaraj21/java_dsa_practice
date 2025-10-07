public class UniqueElementsBruteForceQuestion10 {
    public static void main(String[] args) {
        int[] arr = {1, 1,6, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
