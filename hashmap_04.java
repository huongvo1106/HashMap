/* Online Java Compiler and Editor */
import java.util.HashMap;
import java.util.Map;

public class Main {
    // modulo operation
    static int MOD = 1000000007;
    public static int reverse(int n) {
        int rev = 0;
        while(n > 0){
            rev = (rev * 10 + n%10) % MOD;
            n /= 10;
        }
        return rev;
    }
    public static int countNicePairs(int[] nums) {
        long nice_pairs = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i : nums) {
            int original = i;
            int rev = reverse(i);

            int count = map.getOrDefault(original - rev,0);
            map.put(original - rev,count+1);
            nice_pairs = (nice_pairs + count) % MOD;
        }
        return (int) nice_pairs;
    }
    public static void main(String []args){
        int [] nums = new int [] {13,10,35,24,76};
        
        int result = countNicePairs(nums);
        
        if (result == 4) {
            System.out.print("Correct");
        }
        else {
            System.out.print("Fail");
        }
        
        
     }
}
