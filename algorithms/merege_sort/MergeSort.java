import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort{
    static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
}

    static void MergeSort(int[] arr, int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
        MergeSort(arr, low, mid);       // left half
    MergeSort(arr, mid + 1, high);  // right half
    merge(arr, low, mid, high);
        }
    }
    public static void main(String[] args){
        int[] arr = {38, 27,44, 3,9,82,10};

        MergeSort(arr, 0, arr.length - 1);
        System.out.println("sorted array:  " + Arrays.toString(arr));
    }
}