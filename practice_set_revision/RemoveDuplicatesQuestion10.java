
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesQuestion10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,4,4};
        int n = arr.length;

        Set<Integer> myset = new HashSet<>();
        for(int i=0; i<n;i++){
            myset.add(arr[i]);
        }
        System.out.println(myset);
    }
}
