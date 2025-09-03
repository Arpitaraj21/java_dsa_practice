
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCountElementString {
    public static void main(String[] args) {
        // declare the Scanner class
        Scanner sc = new Scanner(System.in);
        // take user input
        String str = sc.nextLine();

        // precompuation
        HashMap<Character, Integer> hash = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }

        // query
        int q = sc.nextInt();
        while(q-- > 0){
            char ch = sc.next().charAt(0);
            System.out.println(hash.getOrDefault(ch, 0));
        }
        sc.close();
    }
}
