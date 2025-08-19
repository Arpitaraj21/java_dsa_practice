
public class basic_problem_2 {

    static int count = 1;

    public static void PrintNum() {
        if (count == 6) {
            return;
        } else {
            System.out.println(count);
            count++;
            PrintNum();
        }
    }

    public static void main(String[] args) {
        PrintNum();
    }
}
