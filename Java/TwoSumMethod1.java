public class TwoSumMethod1 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 17;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Outer loop index: " + i);
            for (int j = 0; j < nums.length; j++) {
                System.out.println("inner loop index: " + j);
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }
}