public class AlreadySorted {
    static boolean isSorted(int arr[], int n){
        if(n == 0 || n == 1) {
            return true;
        }

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 12, 34, 56,};
        int n = arr.length;

        if(isSorted(arr, n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
