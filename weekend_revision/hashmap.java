
import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }


        //precompuatation
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<n; i++){
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }

        //query
        int q = sc.nextInt();
        while(q-- > 0){
             for(int key: hash.keySet()){
                System.out.println(key + " -> " + hash.get(key));
             }
        }
        sc.close();
    }
}
