package problem.level.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberOfRepeatedCharMustBeUnique {

    /**
     * @Description
     * return true if and only if a number of occurrences of a certain number in a given array is unique
     * */

    /**
     * @Example
     * input: [1,2,2,1,1,3]
     * output: true
     *
     * input: [1,2]
     * false
     *
     * input: [-3,0,1,-3,1,1,1,-3,10,0]
     * output: true
     * */

    public boolean uniqueOccurrences(int[] arr) {
        if(null == arr || arr.length == 0){
            return false;
        }
        final Map<Integer, Integer> frequency = new HashMap<>();
        final Set<Integer> seen = new HashSet<>();

        for(int number: arr){
            frequency.put(number, frequency.getOrDefault(number,0) + 1);
        }
        for(int value: frequency.values()){
            if(seen.contains(value)){
                return false;
            }
            seen.add(value);
        }
        return true;
    }
}
