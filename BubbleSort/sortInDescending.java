public class sortInDescending {

    public static void main(String[] args) {
        int arr[] = {1, 23, 12, 45, 19, 67, 32};

        System.out.print("before sorting, array in original order:  ");
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }

        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("after sorting, array in descending order:  ");
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
