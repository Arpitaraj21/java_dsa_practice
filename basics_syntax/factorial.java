
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long factorial = 1;
        int n = sc.nextInt();
        for(int i= 1; i <= n; i++){
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}
