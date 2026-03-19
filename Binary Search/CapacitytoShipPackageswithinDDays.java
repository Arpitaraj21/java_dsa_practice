public class CapacitytoShipPackageswithinDDays {
    static int capacityToShipPackages(int[] weights, int days){
        int max = 0;
        int sum = 0;
        for(int m: weights){
            max = Math.max(max, m);
            sum += m;
        }

         for(int capacity = max; capacity <= sum; capacity++){
            int requiredDays = findDays(weights, capacity);

            if(requiredDays <= days){
                return capacity;
            }
        }
        return -1;
    }

    static int findDays(int[] weights, int capacity){
        int day= 1, load = 0;
         for(int w: weights){
            if(load + w > capacity){
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
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(capacityToShipPackages(weights, days));
    }
}
