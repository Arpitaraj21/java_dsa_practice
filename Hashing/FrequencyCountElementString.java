
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCountElementString {

    public static void main(String[] args) {
        // Step 1) take scanner class
        Scanner sc = new Scanner(System.in);
        // Step 2) take string input
        String str = sc.nextLine();
        //Step 3) create a hashmap
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            char c = sc.next().charAt(0);
            System.out.println(hash.getOrDefault(c, 0));
        }
        sc.close();
    }
}
