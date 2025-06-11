import java.util.Scanner;

public class arithmeticSeries {
    public static void main(String[] args) {
        // formula for ap = an = a + (n - 1)d
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int d = b - a;

       int nthTerm = (a + (n - 1) * d);
       System.out.println("value of nth term is " + nthTerm);
       sc.close();
    }
}
