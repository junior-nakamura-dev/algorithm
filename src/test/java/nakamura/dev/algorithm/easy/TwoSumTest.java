package nakamura.dev.algorithm.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    final TwoSum twoSum = new TwoSum();

    @Test
    public void shouldReturnTwoIndex() {
        final int[] nums = {11, 15, 2, 7};
        final int target = 9;
        final int[] result = twoSum.twoSum(nums, target);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(2, result[0]);
        Assertions.assertEquals(3, result[1]);
    }

    @Test
    public void shouldReturnNull() {
        final int[] nums = {11, 15, 10, 0};
        final int target = 9;
        final int[] result = twoSum.twoSum(nums, target);

        Assertions.assertNull(result);
    }

}
