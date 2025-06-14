import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take the size of an array from user
        int size = sc.nextInt();

        // initialize the array
        int arr[] = new int [size];

        // interate a for loop to take input from user
        for(int i=0; i < size; i++){
            System.out.println("enter the " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        // interate the array
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
            
        } 
    }
}