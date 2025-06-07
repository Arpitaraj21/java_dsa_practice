import java.util.Scanner;

public class sumOfOddBtwNumber {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N = sc.nextInt();
        int oddCount = 0;

        for(int i=1; i<= N; i++){
            if(N % i != 0){
                System.out.print(i + " ");
                oddCount = oddCount + i;
            }
        }
        System.out.println();
        System.out.println("The sum of all odd numbers between 1-N: " + oddCount);
    }
}
