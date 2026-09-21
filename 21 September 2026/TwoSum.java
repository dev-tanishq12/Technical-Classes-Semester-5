import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i=0; i <n; i++) {
            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 10, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}
