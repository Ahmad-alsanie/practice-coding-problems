package problem.level.easy;

import java.util.*;

public class GroupAnagrams {

    /**
     * @Description
     * An anagram is a word written by the same letters of another word.
     * Given an array of string, group all anagrams together and return List<List<String>>
     * */

    /**
     * @Example
     * input: ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]]
     * */

    /**
     * @Constraint
     * Required time complexity is O(NK)
     * a string in received array cannot exceed 100 length and
     * that's why O(NK) is more efficient than O(NlogN) with a sort solution you can accomplish O(NlogN)
     * 1 <= words.length <= 104
     * 0 <= words[i].length <= 100
     * words[i] consists of lowercase English letters only.
     * */

    public List<List<String>> groupAnagrams(String[] words){
        Map<String, List<String>> result = new HashMap<>();
        int[] key = new int[26];

        if (null == words || words.length == 0) {
            throw new IllegalArgumentException();
        }

        for (String word : words) {

            // initial key: [0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0]
            // key for the word abc for example: [1.1.1.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0]
            Arrays.fill(key, 0);

            for (char c : word.toCharArray()){
                //any char - a returns a number between 26 and 1 where 1 is a and 26 is z
                key[c-'a'] = 1;
            }

            String keyString = Arrays.toString(key);

            if (!result.containsKey(keyString)) {
                result.put(keyString, new ArrayList());
            }
            result.get(keyString).add(word);
        }
        return new ArrayList(result.values());
    }
}
