public class ContainerWithMostWaterBruteForce{
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int n = arr.length;
        int maxWater = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int minHeight = Math.min(arr[i], arr[j]);
                int width = j - i;
                int area = minHeight * width;
                maxWater = Math.max(maxWater, area);
            }
        }
        // return maxWater;
        System.out.println(maxWater);
    }
}