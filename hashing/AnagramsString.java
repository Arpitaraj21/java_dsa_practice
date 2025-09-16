
import java.util.HashMap;
import java.util.Scanner;

public class AnagramsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fisrt_string = "listen";
        String second_String = "silent";

        if(fisrt_string.length() != second_String.length()) return;


        HashMap<Character, Integer> hash_first = new HashMap<>();
        for(int i=0; i<fisrt_string.length(); i++){
            char ch = fisrt_string.charAt(i);
            hash_first.put(ch, hash_first.getOrDefault(ch, 0) +1);
        }

        HashMap<Character, Integer> hash_second = new HashMap<>();
        for(int i=0; i<second_String.length(); i++){
            char ch = second_String.charAt(i);
            hash_second.put(ch, hash_second.getOrDefault(ch, 0) +1);
        }

        if(hash_first.equals(hash_second)){
            System.out.println("it is an anagoran");
        }
        else{
            System.out.println("not anagoran");
        }
    }
}
