
public class basic_problem_3 {

    static int count = 6;

    public static void PrintNums() {
        if (count == 0) {
            return;
        } else {
            System.out.println(count);
            count--;
            PrintNums();
        }
    }

    public static void main(String[] args) {
        PrintNums();
    }
}
