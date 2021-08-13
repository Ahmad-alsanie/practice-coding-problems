package problem.level.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationTest {

    private Permutations permutations;

    @Before
    public void init(){
        permutations = new Permutations();
    }

    @Test
    public void givenAString_whenFindPermInvoked_thenReturnAllPermutations(){
        List<List<Character>> expected = new ArrayList<>();
        expected.add(Arrays.asList('a','b','c'));
        expected.add(Arrays.asList('a','c','b'));
        expected.add(Arrays.asList('c','b','a'));
        expected.add(Arrays.asList('c','a','b'));
        expected.add(Arrays.asList('b','a','c'));
        expected.add(Arrays.asList('b','c','a'));
        Assert.assertTrue(expected.containsAll(permutations.getPermutations("abc")));
    }
}
