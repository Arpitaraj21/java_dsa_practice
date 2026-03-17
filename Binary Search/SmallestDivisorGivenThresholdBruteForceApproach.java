public class SmallestDivisorGivenThresholdBruteForceApproach {
    static int smallestDivisor(int[] arr, int threshold){
        int max = 0;

        for(int m: arr){
            max = Math.max(max, m);
        }

        for(int i=1; i<=max; i++){
            int count = 0;
            for(int num: arr){
                count += Math.ceil((double)num / i);
            }

            if(count <= threshold){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 9 };
        int threshold = 6;
        System.out.println(smallestDivisor(arr, threshold));
    }
}



// linear appraoch but time limit will execede in this