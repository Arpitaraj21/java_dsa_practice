
import java.util.Scanner;

public class powerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter the power of a number");
        int b = sc.nextInt();

        double power = Math.pow(a, b);
        System.out.println(power);
    }
}
