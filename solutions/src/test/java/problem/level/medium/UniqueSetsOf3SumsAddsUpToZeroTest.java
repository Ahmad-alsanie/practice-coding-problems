package problem.level.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueSetsOf3SumsAddsUpToZeroTest {

    AllUniqueSetsOf3SumsAddUpToZero uniqueSets;

    @Before
    public void init(){
        uniqueSets = new AllUniqueSetsOf3SumsAddUpToZero();
    }

    @Test
    public void givenValidArray_whenUniqueSetsOf3Triggered_thenReturnAllSubsetAddsUpToZero(){
        int[] original = {-1,0,1,2,-1,-4};
        List<List<Integer>> actual = uniqueSets.threeSum(original);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1,-1,2));
        expected.add(Arrays.asList(-1,0,1));
        //in any order
        Assert.assertTrue(expected.size() == actual.size() &&
                (expected.get(0).containsAll(actual.get(1))));
    }

}
