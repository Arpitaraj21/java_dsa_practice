
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int num = sc.nextInt();

        int reverseNumber = 0;

        do { 
            int digit = num % 10;
            reverseNumber = reverseNumber * 10 + digit;
            num = num / 10;
        } while (num > 0);
        System.out.println("resverse number" + reverseNumber);
    }
}



/*
 * first take the inital reverseNumber as 0
 * then using do while
 * using modular take the last digit of the number
 * in the reverse number we will multiply it with 10 and then add the last digit
 * we will repeat this process till number is greater than 0
 * 
 */