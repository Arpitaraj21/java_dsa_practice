
import java.util.Scanner;

public class validTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side ");
        int a = sc.nextInt();
        System.out.print("Enter the second side ");
        int b = sc.nextInt();
        System.out.print("Enter the third side ");
        int c = sc.nextInt();

        if(a+b > c && a+c > b && b+c > a) {
            System.out.println("It is a triangle");
        }
        else{
            System.out.println("not a valid triangle");
        }
    }
}

//According to the triangle inequality theorem, for three sides to form a valid triangle:

// Sum of any two sides must be greater than the third side.
