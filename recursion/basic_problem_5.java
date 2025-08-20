
public class basic_problem_5 {

    public static void PrintNums(int n) {
        if (n == 6) {
            return;
        }

        PrintNums(n + 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        PrintNums(1);
    }
}
