
public class MaxSubArraySumReturnIndex {

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        int startIndex = -1;
        int ansStart = -1;
        int ansEnd = -1;

        for (int i = 0; i < n; i++) {
            if (sum == 0) {
                startIndex = i;
            }

            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
                ansStart = startIndex;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println(ansStart + " ," + ansEnd);
    }
}
