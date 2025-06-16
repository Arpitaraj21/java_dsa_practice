

public class BubblesortAlogrithm {

    public static void main(String[] args) {
        int arr[] = {1,34,56,2,12,8};

        System.out.println("Array before sorting :");
          for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            for(int j=1; j <arr.length; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("Array after sorting :");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}