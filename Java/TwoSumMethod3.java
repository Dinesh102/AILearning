import java.util.HashMap;
import java.util.Map;

public class TwoSumMethod3 {
    public static void main(String[] args) {
        int[] nums = { 3,3 };
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Outer loop index: " + i);
            
            int complement = target - nums[i];
            System.out.println("Inner loop index: " + i + ", complement: " + complement);
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[] {  numMap.get(complement),i };
            }
            numMap.put(nums[i], i);
        }

        return new int[] {};
    }
}