
import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // taking a input from user
            int num = sc.nextInt();
            // storing value of num in 2 different variables
            int originalNum = num;
            // count of digit
            int count = 0;
            
            double sum = 0;

            while(num > 0){
                int digit = num % 10;
                System.out.println(digit);
                num = num / 10;
                count ++;
            }
            System.out.println("the number of digit " + count);
            num = originalNum;

            while(num > 0) {
                int digit = num % 10;
                sum = sum + Math.pow(digit, count);
                num = num / 10;
            }
            int value = (int) sum;
            System.out.println("sum of the digit is " + value);

            if(originalNum == value) {
                System.out.println("Armstrong number");
            }
            else{
                System.out.println("Not an armstrong number");
            }
        }
    }
}



// 153
// 1*3 + 5*3 + 3*3 = 153 then armstrong number