// Print numbers from 1 to N

import java.util.Scanner;

public class forLoopCondition {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("till what number u want to print? ");
            int N = sc.nextInt();
            
            for(int i=1; i <= N; i++) {
                System.out.println(i);
            }
        }
    }
}