import java.util.Scanner;

public class sumOfNaturalNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        int sumNaturalNum = 0;

        for(int i=1; i <= N; i++){
            sumNaturalNum = sumNaturalNum + i;
        }
        System.out.println("sum of natural numbers: " + sumNaturalNum);
    }
}