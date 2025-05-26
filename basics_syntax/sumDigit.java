
import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();

        int digitSum = 0;

        do {
            int digit = a % 10;
            digitSum = digitSum + digit;
            a = a / 10;
        }
        while(a > 0);
        System.out.println(digitSum);
        sc.close();
    }
}



/*
 * LOGIC FOR THIS PROGRAM
 * 
 * first we will take an input from the user
 * we will keep the sum of the digit initially as 0
 * using do while loop 
 * 
 * if the user input is greater than 0, 
 * then we will use the modular to get the last digit of usernumber
 * and add the last digit in the sum, 
 * then divide it with 10 to remove the last digit
 * 
 * 
 */

