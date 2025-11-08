
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBruteForce{
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;

        Arrays.sort(arr);
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        set.add(triplet);
                    }
                }
            }
        }
        for(List<Integer> triplet : set){
            System.out.println(triplet);
        }
    }
}