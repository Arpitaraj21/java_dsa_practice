
import java.util.Scanner;

public class  simpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char operator;

        System.out.println("enter the first number: ");
        int a = sc.nextInt();

        System.out.println("enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Enter operator (+ - * /)");

        operator = sc.next().charAt(0);

        switch (operator) {
            case  '+' -> System.out.println(a+b);

            case  '-' -> System.out.println(a-b);

            case  '*' -> System.out.println(a*b);

            case  '/' -> System.out.println(a/b);
            default -> throw new AssertionError();
        }
        sc.close();
    }
}



//  switch (operator) {
//             case  '+':
//                 System.out.println(a+b);
//                 break;

//             case  '-':
//                 System.out.println(a-b);
//                 break;

//             case  '*':
//                 System.out.println(a*b);
//                 break;

//             case  '/':
//                 System.out.println(a/b);
//                 break;
//             default:
//                 throw new AssertionError();
//         }