public class printArrayAfterEachPass {
    public static void main(String[] args) {
        int arr[] = {1,23,12,45,19,67,32};

        // index starts from 0 so length - 1;
        for(int i=0; i < arr.length - 1; i++){
            for(int j=1; j<arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            System.out.print("after pass " + " " + (i+1) + ":  ");
            for(int k=0; k<arr.length; k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}