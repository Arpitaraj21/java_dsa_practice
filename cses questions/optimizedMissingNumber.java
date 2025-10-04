
import java.util.Scanner;

public class optimizedMissingNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number");
        int n = sc.nextInt();

        long expectedSum = n*(n+1) / 2;

        long actualSum = 0;
        System.out.println("Enter the elements");
        for(int i=0; i<n-1; i++){
            actualSum+= sc.nextInt();
        }

        System.out.println(expectedSum - actualSum);
        sc.close();
    }
}