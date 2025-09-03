import java.util.Scanner;

public class FrequencyCountStringUsingArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declared a string
        String str = "Hello World";

        // declare an array of size 256
        int[] array = new int[256];

        //precomputation
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            array[(int) ch]++;
        }

        // no of queries
        int q = sc.nextInt();
        while(q--> 0){
            char query = sc.next().charAt(0);
            System.out.println(array[(int) query]);
        }
        sc.close();
    }
}