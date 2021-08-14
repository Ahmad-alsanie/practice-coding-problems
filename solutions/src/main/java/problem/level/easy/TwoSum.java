package problem.level.easy;

import java.util.*;

public class TwoSum {
    /**
     * @Description
     * given an array of numbers find 2 numbers that adds up to a given target
     * can be returned in any order and you can return first match only
     * - time complexity must be O(n)
     * */

    /**
     * @Example
     * input: [3,2,8,-2,10,7] target= 9
     * output: indexes [1,5]
     * */

    public List<Integer> twoSum(int[] numbers, int target){
        final Map<Integer, Integer> compliments = new HashMap<>();

        for(int i=0; i < numbers.length; i++){
            int compliment = target - numbers[i];
            if(compliments.containsKey(compliment)){
                return Arrays.asList(i, compliments.get(compliment));
            }
            compliments.put(numbers[i], i);
        }
        return Arrays.asList(-1);
    }
}
