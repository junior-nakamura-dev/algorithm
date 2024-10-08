package nakamura.dev.algorithm.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * <p>
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * <p>
 * Constraints:
 * 2 <= nums.length <= 10^4
 * -109 <= nums[i] <= 10^9
 * -109 <= target <= 10^9
 * Only one valid answer exists.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> sumAndIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            final int currentValue = nums[i];
            final int difference = target - currentValue;

            if (sumAndIndexMap.containsKey(difference)) {
                return new int[]{sumAndIndexMap.get(difference), i};
            }
            sumAndIndexMap.put(currentValue, i);
        }
        return null;
    }

}
