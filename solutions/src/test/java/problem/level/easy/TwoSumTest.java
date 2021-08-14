package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TwoSumTest {

    private TwoSum twoSum;

    @Before
    public void init(){
        twoSum = new TwoSum();
    }

    @Test
    public void givenArrayOfNumbersAndTarget_whenTwoSumInvoked_returnIndicesOfValuesAddsUpToTarget(){
        List<Integer> expected = Arrays.asList(1,5);
        int[] numbers = new int[]{3,2,8,-2,10,7};
        Assert.assertTrue(expected.containsAll(twoSum.twoSum(numbers,9)));
    }

    @Test
    public void givenArrayOfNumbersAndTarget_whenTwoSumInvoked_returnMinusOneIfNoValuesAddsUpToTarget(){
        List<Integer> expected = Arrays.asList(-1);
        int[] numbers = new int[]{3,2,8,-2,10,7};
        Assert.assertTrue(expected.containsAll(twoSum.twoSum(numbers,100)));
    }
}
