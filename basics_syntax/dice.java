import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diceNumber = sc.nextInt();

        int sumOfTwoSides = 7;

        int otherNumner = sumOfTwoSides - diceNumber;
        System.out.println("The number on opposite side is: " + otherNumner);
        sc.close();
    }
}
