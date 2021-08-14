package problem.level.hard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import problem.level.Hard.AllCombinationsSumToTarget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllCombinationSumToTargetTest {
    private AllCombinationsSumToTarget combination;

    @Before
    public void init(){
        combination = new AllCombinationsSumToTarget();
    }

    @Test
    public void givenArrayOfNumbersAndATarget_whenCombinationsInvoked_thenReturnAllCombinationsOfSubArraysThatEqualsTarget(){
        int[] numbers = {2,3,5};
        List<List<Integer>> combinations = new ArrayList<>();
        combinations.add(Arrays.asList(2,2,2,2));
        combinations.add(Arrays.asList(2,3,3));
        combinations.add(Arrays.asList(3,5));
        Assert.assertTrue(combinations.containsAll(combination.combinations(numbers,8)));
    }
}
