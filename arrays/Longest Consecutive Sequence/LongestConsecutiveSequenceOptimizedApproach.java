
import java.util.HashSet;

public class LongestConsecutiveSequenceOptimizedApproach {
    public static int LongestConsecutive(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int num: arr){
            set.add(num);
        }

        int longest = 1;

        for(int num: set){
            if(!set.contains(num-1)){
                int count = 1;
                int current = num;

                while(set.contains(current + 1)){
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 3, 2, 4};
        int n = arr.length;
        System.out.println(LongestConsecutive(arr));
    }
}
