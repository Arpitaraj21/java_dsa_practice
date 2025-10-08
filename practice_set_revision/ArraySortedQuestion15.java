public class ArraySortedQuestion15 {
    public static boolean isSorted(int[] arr) {
       for(int i=1; i<arr.length - 1; i++){
         if(arr[i] < arr[i-1]){
            return false;   
        }
       }
       return  true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,3,3,4};
    
        if(isSorted(arr)){
            System.out.println("sorted");
        }  else{
            System.out.println("not sorted");
        }
    }
}
