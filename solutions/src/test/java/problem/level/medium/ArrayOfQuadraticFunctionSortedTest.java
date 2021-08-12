package problem.level.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayOfQuadraticFunctionSortedTest {

    ReturnArrayOfQuadraticFunctionSorted quadraticFunctionSorted;

    @Before
    public void  init(){
        quadraticFunctionSorted = new ReturnArrayOfQuadraticFunctionSorted();
    }

    @Test
    public void givenArrayOfNegativeAndPositiveSortedElements_whenSortTransformArrayIsInvoked_thenReturnArrayOfSortedQuadraticFunctionOfElements(){
        int[] nums = new int[]{-4,-2,2,4};
        int[] expected = new int[]{3,9,15,33};
        int a = 1;
        int b = 3;
        int c = 5;
        Assert.assertArrayEquals(expected, quadraticFunctionSorted.sortTransformedArray(nums,a,b,c));
    }

    @Test
    public void givenArrayOfOneElement_whenSortTransformArrayIsInvoked_thenReturnArrayOfQuadraticFunctionOfElement(){
        int[] nums = new int[]{3};
        int[] expected = new int[]{23};
        int a = 1;
        int b = 3;
        int c = 5;
        Assert.assertArrayEquals(expected, quadraticFunctionSorted.sortTransformedArray(nums,a,b,c));
    }

    @Test
    public void givenNullOrEmptyArray_whenMoveZerosInvoked_thenThrowException(){
        Assert.assertThrows(IllegalArgumentException.class, () -> quadraticFunctionSorted.sortTransformedArray(new int[]{},1,2,3));
        Assert.assertThrows(IllegalArgumentException.class, () -> quadraticFunctionSorted.sortTransformedArray(null,2,3,4));
    }
}
