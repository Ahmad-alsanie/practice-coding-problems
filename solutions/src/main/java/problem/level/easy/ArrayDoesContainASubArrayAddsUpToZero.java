package problem.level.easy;

import java.util.HashSet;
import java.util.Set;

public class ArrayDoesContainASubArrayAddsUpToZero {
    /**
     * @Description
     * Find out if a given array has any of its sub arrays that adds up to zero
     * */

    /**
     * @Example
     * input = [3,2,1,4,-5]
     * output = true
     * */

    /**
     * @Hint
     * accumulative sum [3,5,6,10,5] when you have two matching numbers in sequence for the accumulative
     * sum then that means a sub array has added up to zero, notice 5-5 from index 1 to index 4
     */


    public boolean isZeroSubArray(int[] numbers){
        Set<Integer> seen = new HashSet<>();
        int sum = 0;

        for(int i =0; i < numbers.length; i++){
            sum += numbers[i];
            if(seen.contains(sum)){
                return true;
            }
            seen.add(sum);
        }
        return false;
    }
}
