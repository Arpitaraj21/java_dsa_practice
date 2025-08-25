// wrong way

// public class recursion_2 {
//     static int count = 0;
//     public static void function1() {
//         System.out.println(count);
//         count++;
//         function1();
//     }
//     public static void main(String[] args) {
//         function1();
//     }
// }
//*************************************** */
// right way
public class recursion_2 {

    public static void main(String[] args) {
        int count = 0;
        while (true) {   // infinite loop
            System.out.println(count);
            count++;
        }
    }
}
