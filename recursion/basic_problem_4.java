
public class basic_problem_4 {

    public static void BacktrackingRecursion(int n) {
        if (n == 0) {
            return;
        }

        // recursive call first
        BacktrackingRecursion(n - 1);

        // action after recursion backtracking step
        System.out.println(n);
    }

    public static void main(String[] args) {
        BacktrackingRecursion(5);
    }
}
