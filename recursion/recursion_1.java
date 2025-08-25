
public class recursion_1 {

    static int count = 0;

    public static void function1() {

        if (count == 4) {
            return;
        } else {
            System.out.println(count);
            count++;
            function1();
        }

    }

    public static void main(String[] args) {
        function1();
    }
}
