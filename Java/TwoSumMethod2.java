import java.util.HashMap;
import java.util.Map;

public class TwoSumMethod2 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 18;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Outer loop index: " + i);
            numMap.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int complement = target - nums[j];
            System.out.println("Inner loop index: " + j + ", complement: " + complement);
            if (numMap.containsKey(complement)) {
                return new int[] { j, numMap.get(complement) };
            }
        }

        return new int[] {};
    }
}