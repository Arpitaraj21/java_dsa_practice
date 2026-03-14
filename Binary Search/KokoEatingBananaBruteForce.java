public class KokoEatingBananaBruteForce{
    static int kokoEatingBanana(int[] arr, int k){
        int max = 0;
        // finding the max in the pile
        for(int p: arr){
            max = Math.max(max, p);
        }

        for(int i=1; i<=max; i++){
            int totalTime = 0;
            for(int pile: arr){
                totalTime += Math.ceil((double) pile/ i);
            }
            if(totalTime <= k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3, 6,7,11};
        int k=7;
        System.out.println(kokoEatingBanana(arr, k));
    }
}