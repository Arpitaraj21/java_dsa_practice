public class LCM {
    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return  a;
    }

    public static int lcm(int a, int b) {
        int gcdValue = gcd(a, b);
        return (a * b)/ gcdValue;
    }
    public static void main(String[] args) {
        int a = 60;
        int b = 48;
        System.out.println(lcm(a, b));
    }
}
