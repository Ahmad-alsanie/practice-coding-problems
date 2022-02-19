package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestConsecutiveOccurrencesTest {

    private LongestConsecutiveOccurrences occurrences;

    @Before
    public void init(){
        occurrences = new LongestConsecutiveOccurrences();
    }

    @Test
    public void testFindLongest(){
        Assert.assertEquals(occurrences.findLongestConsecutive("aabbaaaaabcxaaaaaaa",'a'),7);
    }
}
