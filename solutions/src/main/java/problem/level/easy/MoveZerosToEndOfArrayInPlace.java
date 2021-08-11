package problem.level.easy;

import java.util.Arrays;

public class MoveZerosToEndOfArrayInPlace {

    /**
     * @Description
     * Move 0s to the end of the array in place meaning space complexity shouldn't exceed O(1)
     * */

    /**
     * @Example
     * input: [0,12,3,4,0,5]
     * output: [12,3,4,5,0,0]
     * */

    /**
     * @Constraints
     * space O(1)
     * should keep the original array order
     * */

    public static int[] moveZerosToEnd(int[] numbers){
        int previous = 0;

        if(null == numbers || numbers.length == 0){
            throw new IllegalArgumentException("Received array is invalid: " + Arrays.toString(numbers));
        }

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] != 0){
                numbers[previous] = numbers[i];
                previous++;
            }
        }

        for(;previous<numbers.length;previous++){
            numbers[previous] = 0;
        }

        return numbers;
    }

}
