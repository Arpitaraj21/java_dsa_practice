import java.util.Arrays;

public class selection_sort_string {
    public static void main(String[] args) {
        String[] array = {"pear", "apple", "banana"};

        int n = array.length;

        for(int i=0; i<n; i++){
            int mini = 0;
            for(int j=i+1; j<n; j++){
                if(array[i].charAt(0) < array[j].charAt(0)){
                    mini = j;
                }
            }

            String temp = array[i];
            array[i] = array[mini];
            array[mini] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
