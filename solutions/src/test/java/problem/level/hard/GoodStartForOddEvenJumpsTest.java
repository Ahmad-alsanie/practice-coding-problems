package problem.level.hard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GoodStartForOddEvenJumpsTest {
    private GoodStartsForOddEvenJumps jumps;

    @Before
    public void init(){
        jumps = new GoodStartsForOddEvenJumps();
    }

    @Test
    public void givenArrayOfNumbers_whenOddEvenJumpsInvoked_thenReturnNumberOfGoodStartsToReachEndOfArray(){
        int[] givenOne = {10,13,12,14,15};
        int[] givenTwo = {2,3,1,1,4};
        int[] givenThree = {5,1,3,4,2};

        Assert.assertEquals(2, jumps.oddEvenJumps(givenOne));
        Assert.assertEquals(3, jumps.oddEvenJumps(givenTwo));
        Assert.assertEquals(3, jumps.oddEvenJumps(givenThree));
    }
}
