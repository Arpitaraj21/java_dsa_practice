
import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if (a > b) {
            System.out.println("a is largest");
        }
        else if ( b > c) {
            System.out.println("b is largest");
        }
        else if (c > a) {
            System.out.println("c is largest");
        }
        else{
            System.out.println("invalid input");
        }
    }
}
