import java.util.Scanner;

public class kthDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("first number ");
        int a = sc.nextInt();
        System.out.print("second number ");
        int b = sc.nextInt();
        System.out.print("Enter k (from right): ");
        int k = sc.nextInt();


        double power = Math.pow(a, b);
        long intPower = (long) power; // remove decimal part safely
        
        String numStr = Long.toString(intPower);
        if(k > 0 && k <= numStr.length()) {
            char kthDigit = numStr.charAt(numStr.length() - k);
            System.out.println(kthDigit);
        }

        sc.next();
    }
}
