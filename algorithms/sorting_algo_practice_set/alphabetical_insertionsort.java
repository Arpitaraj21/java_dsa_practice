import java.util.Arrays;

public class alphabetical_insertionsort {
    public static void main(String[] args) {
        String[] str = {"swati", "arpita", "sweta","tulika", "choti"};

        for(int i=0; i<str.length; i++){
            String key = str[i];
            int j = i-1;
            while(j >= 0 && str[j].compareTo(key) > 0){
                str[j+1] = str[j];
                j--;
            }
            str[j+1] = key;
        }
        System.out.println(Arrays.toString(str));
    }
}
 