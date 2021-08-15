package problem.level.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntersectionOfTwoArraysTest {

    IntersectionOfTwoArrays intersection;

    @Before
    public void init(){
        intersection = new IntersectionOfTwoArrays();
    }

    @Test
    public void givenTwoArrays_whenIntersectionInvoked_thenReturnIntersectionInAnyOrder(){
        int[] given = new int[]{1,2,2,1};
        int[] expected = new int[]{2,2};
        Assert.assertArrayEquals(expected,intersection.intersect(given,expected));
    }

    @Test
    public void givenTwoArrays_whenIntersectionInvoked_thenReturnLongestIntersection(){
        int[] given = new int[]{1,2,2,1,3,4,5,2,2};
        int[] expected = new int[]{1,3,4};
        Assert.assertArrayEquals(expected,intersection.intersect(given,expected));
    }

    @Test
    public void givenTwoArraysWithNegativeNumbers_whenIntersectionInvoked_thenReturnLongestIntersection(){
        int[] given = new int[]{1,2,-2,-1,-3,-4,5,2,2};
        int[] expected = new int[]{-1,-3,-4};
        Assert.assertArrayEquals(expected,intersection.intersect(given,expected));
    }
}
