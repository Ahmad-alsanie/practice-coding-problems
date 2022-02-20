package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberOfEvenDigitsEntriesTest {

    private NumberOfEvenDigitsEntries entries;

    @Before
    public void init(){
        entries = new NumberOfEvenDigitsEntries();
    }

    @Test
    public void testFindNumberOfEvenDigits(){
        Assert.assertEquals(entries.findNumberOfEvenDigits(new int[]{0,12,3,4,0,5,1562}),2);
    }
}
