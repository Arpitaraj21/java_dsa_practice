
import java.util.HashMap;
import java.util.Scanner;

public class non_repating_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "swiss";

        HashMap<Character, Integer> hash = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            hash.put(str.charAt(i), hash.getOrDefault(str.charAt(i), 0) + 1);
        }

        char ans = '_';
        for(int i=0; i<str.length(); i++){
            if(hash.get(str.charAt(i)) == 1){
                ans = str.charAt(i);
                break;
            }
        }

  // Step 3: Print result
        if (ans == '_') {
            System.out.println("No non-repeating character found");
        } else {
            System.out.println("First non-repeating character: " + ans);
        }    }
}
