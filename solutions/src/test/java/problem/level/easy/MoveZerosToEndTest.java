package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoveZerosToEndTest {

    MoveZerosToEndOfArrayInPlace zerosShifter;

    @Before
    public void init(){
        zerosShifter = new MoveZerosToEndOfArrayInPlace();
    }

    @Test
    public void givenValidArray_whenMoveZerosInvoked_thenReturnOriginalArrayWithZerosShiftedToEnd(){
        int[] expected = {4,9,16,25,0,0,0};
        Assert.assertArrayEquals(zerosShifter.moveZerosToEnd(new int[]{4,0,0,9,0,16,25}), expected);
    }
    @Test
    public void givenNullOrEmptyArray_whenMoveZerosInvoked_thenThrowException(){
        Assert.assertThrows(IllegalArgumentException.class, () -> zerosShifter.moveZerosToEnd(new int[]{}));
        Assert.assertThrows(IllegalArgumentException.class, () -> zerosShifter.moveZerosToEnd(null));
    }

    @Test
    public void givenValidOneElementArray_whenMoveZerosInvoked_thenReturnOriginal(){
        int[] expected = {2};
        Assert.assertArrayEquals(zerosShifter.moveZerosToEnd(new int[]{2}), expected);
    }
}
