
import java.util.Scanner;

public class sumSquareNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();

        int sumOfSquareNumber = 0;
        for(int i=1; i <= n; i++){
            int square = i * i;
            sumOfSquareNumber = sumOfSquareNumber + square;
        }
        System.out.println("the sum of squares of first n natural numbers is " + sumOfSquareNumber);
    }
}
