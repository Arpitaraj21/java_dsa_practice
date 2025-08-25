
public class basic_problem_1 {

    static int count = 0;

    public static void PrintName() {
        if (count == 5) {
            return;
        } else {
            System.out.println("arpita");
            count++;
            PrintName();
        }
    }

    public static void main(String[] args) {
        PrintName();
    }
}
