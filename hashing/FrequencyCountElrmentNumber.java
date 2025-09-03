
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCountElrmentNumber {
    public static void main(String[] args) {
        // declare the Scanner class
        Scanner sc = new Scanner(System.in);
        // take the size of array
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        // decalre an array
        int[] arr = new int[n];
        
        System.out.println("Enter element for array");
        // take elements of array from user
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // precomputation

    // create a hashmap
    HashMap<Integer, Integer> hash = new HashMap<>();
    for(int i=0; i<n; i++){
        hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
    }

    // queries
    // total number of query
    System.out.println("Enter total number of query: ");
    int q = sc.nextInt();
    // q is greater
    while(q-- > 0){
        // take user input for query
        System.out.println("enter the number for query: ");
        int num = sc.nextInt();
        System.out.println(hash.getOrDefault(num, 0));
    }
    sc.close();
    }
}
