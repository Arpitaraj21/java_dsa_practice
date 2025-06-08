
import java.util.Scanner;

public class closestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of m: ");
        int m = sc.nextInt();

        int q = n / m;
        int firstCandidate = m * q;
        System.out.println("value of first value closest to n: " + firstCandidate);

        int secondCandidate;
        if(n < 0 && m > 0){
            secondCandidate = m * (q - 1);
            System.out.println("value of second value closest to n: " + secondCandidate);
        }
        else {
            secondCandidate = m * (q + 1);
            System.out.println("value of second value closest to n: " + secondCandidate);

        }

        int dist1 = Math.abs(n - firstCandidate);
        int dist2 = Math.abs(n - secondCandidate);

        if(dist1 > dist2) {
            System.out.println("the value closest to n is " + secondCandidate);
        }
        else if(dist1 < dist2) {
            System.out.println("the value closest to n is " + firstCandidate);
        }
        else {
            if(Math.abs(firstCandidate) > Math.abs(secondCandidate)) {
                System.out.println("the closest value is " + firstCandidate);
            }
            else {
                System.out.println("the second value is " + secondCandidate);
            }
        }
        sc.close();
    }
}
