import java.util.ArrayList;
import java.util.List;

public class RearranageArrayBySignBrute{
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int n = arr.length;

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();


        for(int num: arr){
            if(num > 0) positive.add(num);
            else negative.add(num);
        }

        for(int i=0; i<n/2; i++){
            arr[2*i] = positive.get(i);
            arr[2*i + 1] = negative.get(i);
        }

        for(int num: arr){
            System.out.print(num + " ");
        }

    }
}