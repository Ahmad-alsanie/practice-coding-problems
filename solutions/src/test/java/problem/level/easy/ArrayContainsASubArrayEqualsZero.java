package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayContainsASubArrayEqualsZero {
    ArrayDoesContainASubArrayAddsUpToZero subArrayZero;

    @Before
    public void init(){
        subArrayZero = new ArrayDoesContainASubArrayAddsUpToZero();
    }

    @Test
    public void givenArrayContainingSubArrayEqualsZero_whenIsZeroSubArrayInvoked_thenReturnTrue(){
        Assert.assertTrue(subArrayZero.isZeroSubArray(new int[]{3,2,1,4,-5}));
    }
}
