
import java.util.HashSet;
import java.util.Set;

public class UniqueArrayElementBruteForce {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 1, 2, 3, 4, 4, 5, 6 };

        Set<Integer> unique = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            unique.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            unique.add(arr2[i]);
        }

        int length = unique.size();

        System.out.println(length);

        for(int num: unique){
            System.out.print(num + " ");
        }

    }
}
