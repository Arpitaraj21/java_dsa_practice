import java.util.Scanner;

public class evenBtwNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        int EvenCount = 0;

        for(int i=1; i<=N; i++){
            if(N % i == 0){
                System.out.print(i+ " ");
                EvenCount = EvenCount + i;
            }
            // this will print the sum after every iteration
            // System.out.println("Sum of even number between 1 to N is: " + EvenCount);
        }
        System.out.println();
         System.out.println("Sum of even number between 1 to N is: " + EvenCount);

    }
}
