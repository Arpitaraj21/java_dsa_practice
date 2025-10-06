public class LinearSearchQuestion6 {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        int n = arr.length;

        int num = 5;
        for(int i=0; i<n; i++){
            if(arr[i] == num){
                System.out.println(i);
            }
        }
    }
}
