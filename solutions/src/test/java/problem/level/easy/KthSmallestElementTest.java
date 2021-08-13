package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KthSmallestElementTest {
    private KthSmallestElement smallestElement;

    @Before
    public void init(){
        smallestElement = new KthSmallestElement();
    }

    @Test
    public void givenArrayOfNumbers_whenFindKthLargestInvoked_thenReturnKthLargestNumber(){
        int[] numbers = new int[]{4,5,3,6,14,10,66};
        Assert.assertEquals(5, smallestElement.findKthSmallest(numbers,3));
    }
}
