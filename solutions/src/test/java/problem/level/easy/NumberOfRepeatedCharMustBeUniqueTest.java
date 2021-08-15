package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberOfRepeatedCharMustBeUniqueTest {
    private NumberOfRepeatedCharMustBeUnique unique;

    @Before
    public void init(){
        unique = new NumberOfRepeatedCharMustBeUnique();
    }

    @Test
    public void givenArrayOfNumbers_whenUniqueOccurrenceInvoked_thenReturnTrueIfNumberRepeatedUniqueNumberOfTimes(){
        Assert.assertTrue(unique.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
        Assert.assertTrue(unique.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }

    @Test
    public void givenArrayOfNumbers_whenUniqueOccurrenceInvoked_thenReturnFalseIfNumberIsNotRepeatedUniqueNumberOfTimes(){
        Assert.assertFalse(unique.uniqueOccurrences(new int[]{1,2,3}));
    }

}
