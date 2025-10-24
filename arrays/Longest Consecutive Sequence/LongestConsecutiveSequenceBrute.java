public class LongestConsecutiveSequenceBrute{
    public static boolean ls(int[] arr, int x){
            for(int i=0; i<arr.length; i++){
                if(arr[i] == x){
                    return true;
                }
            }
            return false;
    }
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1};
        int n = arr.length;

        int longest = 1;
        for(int i=0; i<n; i++){
            int x = arr[i];
            int count = 1;
            while(ls(arr, x+1) == true){
                x= x+1;
                count+=1;
            }
            longest = Math.max(longest, count);
            }
            System.out.println(longest);
        }
    }

