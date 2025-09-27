
import java.util.Arrays;

public class quick_sort {
    public static void Quicksort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            Quicksort(arr, low, p);
            Quicksort(arr, p+1, high);
        }
    }
    
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low -1;
        int j = high+1;
        while(true){
            do { 
                i++;
            } while (arr[i] < pivot);
            do { 
                j--;
            } while (arr[j] > pivot);

            if(i >= j){
                return j;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,12,4,5,2,1};
        System.out.println("original array: " + Arrays.toString(arr));
        Quicksort(arr,0,arr.length - 1);
        System.out.println("sorted array: " + Arrays.toString(arr));
    }
}
