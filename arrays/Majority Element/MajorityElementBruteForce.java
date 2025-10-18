public class MajorityElementBruteForce{
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 1, 2, 2};
        int n = arr.length;
        int M = n/2;
        
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > M){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}