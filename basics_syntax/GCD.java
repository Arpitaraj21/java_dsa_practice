public class GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(60, 48));
    }
}




/*
 * temp b saves the current value of the b before changing it 
 * b = a % b calculates the remainder of  a /b which will we the new b
 * a = temp, updates the old value of b to a
 * this loop continues until b become zero
 * at the end, a is the GCD
 */