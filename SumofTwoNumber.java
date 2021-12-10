import java.util.HashMap;
import java.util.Map;

public class SumofTwoNumber {

    public static void main(String[] args) {
       int[] nums = {2,7,11,15};
       int target = 9;
       int[] indexes = twoSum(nums,target);
       for (int i : indexes) {
           System.out.println(i);
       }
    }
    
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i< n;i++){
            if(minSoFar > prices[i])
                minSoFar = prices[i];
            else
                maxProfit = Math.max(prices[i] - minSoFar, maxProfit);
        }
        return maxProfit;
     }
}
