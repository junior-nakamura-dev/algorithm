package nakamura.dev.algorithm.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharacterTest {

    final LongestSubstringWithoutRepeatingCharacter longestSubstringWithoutRepeatingCharacter = new LongestSubstringWithoutRepeatingCharacter();

    @Test
    public void shoudReturnMaxLengthAs3() {

        final int result = longestSubstringWithoutRepeatingCharacter.lengthOfLongestSubstring("abcabccc");

        Assertions.assertEquals(3, result);
    }

    @Test
    public void shoudReturnMaxLengthAs1() {

        final int result = longestSubstringWithoutRepeatingCharacter.lengthOfLongestSubstring("bbbbb");

        Assertions.assertEquals(1, result);
    }

}