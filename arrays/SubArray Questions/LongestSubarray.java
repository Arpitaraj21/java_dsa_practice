import static java.lang.Math.max;

public class LongestSubarray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int n = arr.length;
        int K =3;
        int maxLen = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n;j++){
                sum += arr[j];

                if(sum == K){
                    int len = j-i+1;
                    maxLen = max(maxLen, len);
                }
            }
        }
        System.out.println("max length is  " + maxLen);
    }
}

// this is the brute force if we do it using 2 loop it is using O(n^2) and if we take 3 loop 
// to iterate over i -> j then we are using O(n^3)