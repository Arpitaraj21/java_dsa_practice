public class KokoEatingBananaBinarySearch {
    static int KokoEatingBanana(int[] arr, int k) {
        int max = 0;
        for (int p : arr) {
            max = Math.max(max, p);
        }

        int low = 1;
        int high = max;

        while (low <= high) {
            int mid = (low + high) / 2;

            int totalTime = 0;
            for (int pile : arr) {
                totalTime += (pile + mid - 1) / mid;
            }

            if (totalTime > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 7, 11 };
        int k = 8;
        System.out.println(KokoEatingBanana(arr, k));
    }
}
