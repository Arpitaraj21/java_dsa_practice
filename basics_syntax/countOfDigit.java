
import java.util.Scanner;

public class countOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while(num > 0) {
            int digit = num % 10;
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
