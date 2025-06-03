
import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;

        for(int i=1; i<n ; i++){
            if(n % i == 0) {
                System.out.println(i);
                count = count + i;
            }   
        }
        System.out.println("Sum of the all the divisor" +count);
        if(n == count) {
            System.out.println("Its is a perfect number");
        }
    }
}
