package problem.level.hard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinimumNumberOfOperationsToMoveAllBallsToAllBoxesTest {
    private MinimumNumberOfOperationsToMoveAllBallsToAllBoxes minimum;

    @Before
    public void init(){
        minimum = new MinimumNumberOfOperationsToMoveAllBallsToAllBoxes();
    }

    @Test
    public void givenAStringOfBallsInBoxesWhere1RepresentsABallAnd0RepresentEmptyBox_whenMinimumOpsInvoked_thenReturnMinimumNumberOfOpsToMoveAllBallsToAllBoxes(){
        final String boxes = "110";
        final int[] expected = {1,1,3};
        final String boxesSetTwo = "001011";
        final int[] expectedExtreme = {11,8,5,4,3,4};
        Assert.assertArrayEquals(expected, minimum.minOperations(boxes));
        Assert.assertArrayEquals(expectedExtreme, minimum.minOperations(boxesSetTwo));
    }
}
