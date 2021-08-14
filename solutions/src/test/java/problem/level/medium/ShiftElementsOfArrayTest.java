package problem.level.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShiftElementsOfArrayTest {
    private ShiftElementsOfArrayToRightKPlaces shift;

    @Before
    public void init(){
        shift = new ShiftElementsOfArrayToRightKPlaces();
    }

    @Test
    public void givenArrayOfNumbersAndShiftFactor_whenRotateInvoked_thenRotateArray(){
        int[] expected = {5,6,7,1,2,3,4};
        int[] numbers = {1,2,3,4,5,6,7};
        Assert.assertArrayEquals(expected, shift.rotate(numbers, 3));
    }
}
