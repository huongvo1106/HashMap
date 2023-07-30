/* Online Java Compiler and Editor */
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        for(int i : nums) {
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (k == 0) {
                //count all the numbers which appear more than once.
                if(entry.getValue() > 1){
                    result++;
                }
            }

            else {
                if (map.containsKey(entry.getKey() + k)){
                    result++;
                }
            }
        }

        return result;
    }
    public static void main(String []args){
        int [] nums = new int [] {3,1,4,1,5};
        int k = 2;
        
        int result = findPairs(nums, k);
        
        System.out.print(result);
     }
}
