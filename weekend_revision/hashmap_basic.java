
import java.util.HashMap;
import java.util.Scanner;

public class hashmap_basic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // precomputation
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }

        // query
        System.out.println("Enter the num of query");
        int q = sc.nextInt();
        while (q-- > 0) {
            int num = sc.nextInt();
            System.out.println(hash.getOrDefault(num, 0));
        }
        sc.close();
    }
}