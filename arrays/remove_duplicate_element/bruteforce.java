import java.util.HashSet;
import java.util.Set;

public class bruteforce {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3,3};
        int n = arr.length;
   Set<Integer> unique = new HashSet<Integer>();

        for(int i=0; i<n; i++){
            unique.add(arr[i]);
        }

        int length = unique.size();
        System.out.println(length);
        System.out.println(unique);
    }
}
