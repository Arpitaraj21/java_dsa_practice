public class countSwapsToSort {
    public static void main(String[] args){
        int arr[] = {1, 23,56,34,87,12};

        int countSwap = 0;
        
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    countSwap++;
                }
            }
        }
        System.out.println("the number of swap required is " + countSwap);
    }
}
