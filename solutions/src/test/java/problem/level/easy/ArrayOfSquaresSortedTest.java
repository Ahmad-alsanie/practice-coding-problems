package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayOfSquaresSortedTest {

    private ReturnArrayOfSquaresSorted sqrt;

    @Before
    public void init(){
        sqrt = new ReturnArrayOfSquaresSorted();
    }

    @Test
    public void givenValidMixedNegativePositiveArray_whenSortedSquaresInvoked_thenReturnSortedSqrtValuesSorted(){
        int[] expected = {4,9,16,25};
        Assert.assertArrayEquals(sqrt.sortedSquaresTimeOptimized(new int[]{-3,-2,4,5}), expected);
    }

    @Test
    public void givenValidPositiveArray_whenSortedSquaresInvoked_thenReturnSortedSqrtValuesSorted(){
        int[] expected = {4,9,16,25};
        Assert.assertArrayEquals(sqrt.sortedSquaresTimeOptimized(new int[]{2,3,4,5}), expected);
    }

    @Test
    public void givenNullOrEmptyArray_whenSortedSquaresInvoked_thenThrowException(){
        Assert.assertThrows(IllegalArgumentException.class, () -> sqrt.sortedSquaresTimeOptimized(new int[]{}));
        Assert.assertThrows(IllegalArgumentException.class, () -> sqrt.sortedSquaresTimeOptimized(null));
    }

    @Test
    public void givenValidOneElementArray_whenSortedSquaresInvoked_thenReturnSortedSqrtValue(){
        int[] expected = {4};
        Assert.assertArrayEquals(sqrt.sortedSquaresTimeOptimized(new int[]{2}), expected);
    }

}
