import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            boolean[] isPrime = new boolean[n + 1];
            for (int i = 2; i <= n; i++) {
                isPrime[i] = true;
            }

            for (int i = 2; i * i <= n; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            for (int i = 2; i <= n; i++) {
                if (isPrime[i]) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
