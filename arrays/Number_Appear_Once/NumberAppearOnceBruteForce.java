public class NumberAppearOnceBruteForce{
    public static void main(String[] args){
        int[] arr = {2,3,5,3,2};
        int n = arr.length;
        int ans = -1;

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                ans = arr[i];
                break;
            }
        }
        System.out.println(ans);
    }
}