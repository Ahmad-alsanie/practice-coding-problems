package problem.level.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutDuplicates {
    /**
     * @Description
     * given an string, find the length of the longest substring without repeating characters
     * */

    /**
     * @Example
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * */

    //Instead of using a set to tell if a character exists or not,
    // we could define a mapping of the characters to its index.
    // Then we can skip the characters immediately when we found a repeated character.
    //
    //The reason is that if s[j]s[j] have a duplicate in the range [i, j)[i,j) with index j'j
    //′
    // , we don't need to increase ii little by little. We can skip all the elements in the range [i, j'][i,j
    //′
    // ] and let ii to be j' + 1j
    //′
    // +1 directly.

    //see visuals here: https://leetcode.com/problems/longest-substring-without-repeating-characters/solution/

    public int lengthOfLongestSubstring(String word) {
        int length = word.length();
        int result = 0;
        Map<Character, Integer> seen = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < length; j++) {
            if (seen.containsKey(word.charAt(j))) {
                i = Math.max(seen.get(word.charAt(j)), i);
            }
            result = Math.max(result, j - i + 1);
            seen.put(word.charAt(j), j + 1);
        }
        return result;
    }
}
