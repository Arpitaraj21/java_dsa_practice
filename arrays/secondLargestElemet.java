public class secondLargestElemet {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 4, 1};

        for(int i=0; i < arr.length; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("The 2nd largest element is " + arr[arr.length-2]);
    }
}
