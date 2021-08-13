package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagramsTest {

    private GroupAnagrams anagrams;

    @Before
    public void init(){
        anagrams = new GroupAnagrams();
    }

    @Test
    public void givenArrayOfWordsIsPassed_whenGroupAnagramsTriggered_thenReturnGroupedAnagrams(){
        List<List<String>> expected= new ArrayList<>();
        List<List<String>> actual = anagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        expected.add(Arrays.asList("eat","tea","ate"));
        expected.add(Arrays.asList("bat"));
        expected.add(Arrays.asList("tan","nat"));
        Assert.assertTrue(expected.size() == actual.size());
        Assert.assertEquals(expected, actual);
    }
}
