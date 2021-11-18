package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicatesInSortedArrayInPlaceTest {
    private RemoveDuplicatesInPlaceSortedArrayAndReturnIndexOfLastElementWithoutDuplicates duplicates;

    @Before
    public void init(){
        duplicates = new RemoveDuplicatesInPlaceSortedArrayAndReturnIndexOfLastElementWithoutDuplicates();
    }

    @Test
    public void givenSortedArrayOfNumbers_whenRemoveDuplicatesInvoked_thenReturnIndexAfterShiftingOfNoneDuplicates(){
        Assert.assertEquals(5, duplicates.removeDuplicates(new int[]{1,2,3,3,4,4,14}));
    }
}
