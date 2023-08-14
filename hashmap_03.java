/* Online Java Compiler and Editor */
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static long countBadPairs(int[] nums) {
        // number of number in the array
        long n = nums.length;
        // maximum number of pair which was created from n number
        long total_pairs = n*(n-1)/2;
        // initiate hashMap
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(nums[i] - i, map.getOrDefault(nums[i] - i,0) + 1);
            // System.out.print(map.get(nums[i] - i));
        }
        // find number of good pair
        long good_pairs = 0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            long value = entry.getValue(); 
            if (value > 1){
                good_pairs += value * (value - 1)/2;
            }
        }

        return total_pairs - good_pairs;
    }
    public static void main(String []args){
        int [] nums = new int [] {56,30,2,73,28,81,75,75,18,63,54,10,69,85,33,89,12,78,57,60,54,65,74,63,53,77};
        
        long result = countBadPairs(nums);
        
        System.out.print(result);
     }
}
