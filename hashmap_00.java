/* Online Java Compiler and Editor */
import java.util.HashMap;

public class Main {
    public static int [] twoSum(int [] nums, int target) {
        HashMap<Integer,Integer> myMap= new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int remain = target - nums[i];
            if (myMap.containsKey(remain)){
                return new int[]{myMap.get(remain),i};
            }
            myMap.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String []args){
        int [] nums = new int [] {1,2,4};
        int target = 3;
        
        int [] results = twoSum(nums, target);
        
        System.out.print(results[0]);
        System.out.print(results[1]);
     }
}
