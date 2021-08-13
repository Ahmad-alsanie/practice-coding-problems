package problem.level.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {

    /**
     * @Description
     * find all permutations of a given string
     * */

    /**
     * @Example
     * Input: s = "abc"
     * Output: [[abc][bca][cba][cab][bac][acb]]
     * */

    /**
     * @Hint
     * use backtrack
     * */

    public List<List<Character>> getPermutations(String original){
        List<List<Character>> result = new ArrayList<>();
        List<Character> originalChars = original.chars().mapToObj(c-> (char)c).collect(Collectors.toList());
        backtrack(originalChars, result, 0, original.length());
        return result;
    }

    private void backtrack(List<Character> currentPerm, List<List<Character>> result, int start, int length) {
        if(start == length){
            result.add(new ArrayList<>(currentPerm));
        }
        for(int i = start; i < length; i++){
            Collections.swap(currentPerm, start, i);
            backtrack(currentPerm,result,start+1,length);
            Collections.swap(currentPerm,start,i);
        }
    }
}
