
import java.util.HashMap;
import java.util.Map;

public class MajorityElementBetterApproach {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 1, 2, 2};
        int n = arr.length;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }
        
      for(int key : map.keySet()){
        if(map.get(key) > n/2){
            System.out.println(key);
            return;
        }
      }
        System.out.println("no majority element found");
    }
}
