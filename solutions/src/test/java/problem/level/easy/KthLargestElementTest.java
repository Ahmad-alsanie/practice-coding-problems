package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KthLargestElementTest {

    private KthLargestElement largestElement;

    @Before
    public void init(){
        largestElement = new KthLargestElement();
    }

    @Test
    public void givenArrayOfNumbers_whenFindKthLargestInvoked_thenReturnKthLargestNumber(){
        int[] numbers = new int[]{4,5,3,6,14,10,66};
        Assert.assertEquals(10, largestElement.findKthLargest(numbers,3));
    }
}
