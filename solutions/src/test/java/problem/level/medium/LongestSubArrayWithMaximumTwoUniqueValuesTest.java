package problem.level.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestSubArrayWithMaximumTwoUniqueValuesTest {
    private LongestSubArrayWithMaximumTwoUniqueValues uniqueValues;

    @Before
    public void init(){
        uniqueValues = new LongestSubArrayWithMaximumTwoUniqueValues();
    }

    @Test
    public void validate_longest_unique_two_char_sub_array(){
        int[] given = {1,2,1};
        int[] givenTwo = {0,1,2,2};
        int[] givenThree = {3,3,3,1,2,1,1,2,3,3,4};
        Assert.assertEquals(3, uniqueValues.totalFruit(given));
        Assert.assertEquals(3, uniqueValues.totalFruit(givenTwo));
        Assert.assertEquals(5, uniqueValues.totalFruit(givenThree));
    }
}
