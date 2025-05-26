
import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int originalNum = num;

        int reverseNumber = 0;

        do { 
            int digit = num % 10;
            reverseNumber = reverseNumber * 10 + digit;
            num = num / 10;
        } while (num > 0);

        System.out.println(reverseNumber);
        if (originalNum  == reverseNumber) {
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("Not a palindrome number");
        }
        sc.close();
    }
}


/*
 * palindrome means the reverse of the number will be same as the original 
 * first we will keep the reverse number as 0,
 * after taking the user input we need to store the user input in a variable 
 * using do while if num is greater than 0
 * we will use modular and remove the last digit from the number,
 * will do the same as reverse number and then check from the new variable with reverse value 
 * if both are same then palindrome otherwise not a palindrome
 */