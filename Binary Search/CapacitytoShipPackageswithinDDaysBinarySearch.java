public class CapacitytoShipPackageswithinDDaysBinarySearch {

    static int capacityToShipPackages(int[] weights, int days) {
        int max = 0, sum = 0;
        for (int m : weights) {
            max = Math.max(max, m);
            sum += m;
        }

        int low = max;
        int high = sum;

        while (low <= high) {
            int mid = (low + high) / 2;

            int requiredDays = findDays(weights, mid);

            if (requiredDays <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static int findDays(int[] weights, int mid){
        int day=1, load = 0;
        for(int w: weights){
            if(load + w > mid){
                day++;
                load = w;
            }
            else{
                load += w;
            }
        }
        return day;
    }

    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        System.out.println(capacityToShipPackages(weights, days));
    }
}
