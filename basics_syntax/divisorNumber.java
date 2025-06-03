import java.util.Scanner;

public class divisorNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        for(int i=1; i<= a; i++){
            if(a % i == 0){
                System.out.println(i);
            }
        }
    }
}


/*
 *   to find divisor -> divisor means which divides the number perfectly
 *   so for that we will run a loop from 1 to that number and in that loop 
 *   we will check if that number is completely divisible by 0 then print 
 *   that number, 
 */