
import java.util.HashMap;
import java.util.Scanner;

public class StringAnagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take first string
        String firstWord = sc.nextLine();
        // take second string
        String secondWord = sc.nextLine();

        // hashmap 
        HashMap<Character, Integer> hashOne = new HashMap<>();
        for (int i = 0; i < firstWord.length(); i++) {
            char chOne = firstWord.charAt(0);
            hashOne.put(, null);
        }
    }
}
