public  class MajorityElementOptimizedApproach{
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 1, 2, 2};
        int n = arr.length;

        int count = 0;
        int candidate = -1;

        for(int i=0; i<n; i++){
            if(count == 0){
                candidate = arr[i];
            }
            else if(candidate == arr[i]){
                count++;
            }
            else{
                count--;
            }
        }

        count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == candidate){
                count++;
            }
        }

        if(count > n/2){
            System.out.println(candidate);
        }
        else{
            System.out.println("no majority element");
        }

    }
}