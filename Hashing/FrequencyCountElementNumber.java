
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCountElementNumber {

    public static void main(String[] args) {

        // step 1) import the scanner class
        Scanner sc = new Scanner(System.in);

        //Step 2) take the size of an array
        System.out.println("enter the size of an array: ");
        int n = sc.nextInt();

        // Step 3) declare an array of size n
        int[] arr = new int[n];

        // step 4) take the elements from the user
        System.out.println("enter elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // precomputation
        //Step 5) create a hashmap 
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // Step 6) add the elements in the hashmap
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }

        // query 
        System.out.println("enter the number of queries");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("enetr the element to find frequency: ");
            int num = sc.nextInt();
            System.out.println(hash.put(num, 0));
        }

        sc.close();
    }
}
