public class MaxProfiteInBuyAndSellStocks{
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int n = arr.length;

        int mini = arr[0];
        int profite = 0;
        for(int i=1;i<n;i++){
            int cost = arr[i] - mini;
            profite = Integer.max(profite, cost);
            mini= Integer.min(mini, arr[i]);
        }

        System.out.println(profite);
    }
}