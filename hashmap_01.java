/* Online Java Compiler and Editor */
import java.util.HashMap;

public class Main {
    public static int countKDifference(int[] nums, int k) {
        // key is the value of element; value is the number of times which the element exists in the array.
        HashMap<Integer, Integer> unique = new HashMap<>();
        int result = 0;
        for(int n : nums) {
            // System.out.println(n);
            // add n to map
            int lower = n - k;
            if (unique.containsKey(lower)){
                result = result + unique.get(lower);
                // System.out.println(lower);
            }

            int upper = n + k;
            if (unique.containsKey(upper)){
                result = result + unique.get(upper);
                // System.out.println(upper);
            }
            if (!unique.containsKey(n)){
                unique.put(n,1);
            }

            else {
                unique.put(n, unique.get(n) + 1);
            }
            // System.out.println("done");
        }
       return result;
    }
    public static void main(String []args){
        int [] nums = new int [] {1,2,2,1};
        int k = 1;
        
        int result = countKDifference(nums, k);
        
        System.out.print(result);
     }
}
