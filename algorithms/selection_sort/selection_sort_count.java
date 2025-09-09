import java.util.Arrays;

public class selection_sort_count {
    public static void main(String[] args) {
        int[] array = { 29, 10, 14, 37, 14 };

        int n = array.length;
        int comparision = 0;
        for (int i = 0; i < n; i++) {
            int max_index = i;
            for (int j = i + 1; j < array.length; j++) {
                comparision++;
                if (array[j] < array[max_index]) {
                    max_index = j;
                }

            }
            System.out.println(Arrays.toString(array));
            if (max_index != i) {
                int temp = array[i];
                array[i] = array[max_index];
                array[max_index] = temp;
            }
        }
        System.out.println("comaprison = " + comparision);
        System.out.println(Arrays.toString(array));
    }
}
