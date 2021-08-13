package problem.level.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberOfSubArraysAddsUpToTargetTest {
    private HowManySubArraysAddsUpToTarget subArraysAddsUpToTarget;

    @Before
    public void init(){
        subArraysAddsUpToTarget = new HowManySubArraysAddsUpToTarget();
    }

    @Test
    public void givenArrayOfNumbers_whenNumberOfSubArraysInvoked_thenReturnNumberOfSubArraysAddsUpToTarget(){
        int[] numbers = new int[]{2,6,3,4,5,10,9};
        Assert.assertEquals(3,
                subArraysAddsUpToTarget.numberOfSubArrayEqualsTarget(numbers, 9));
    }
}
