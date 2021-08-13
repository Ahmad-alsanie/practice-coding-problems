package problem.level.easy;

public class FindDuplicatesIntegerInPlaceWhenNumbersArePositiveAndLessThanN {

    /**
     * @Description
     * Find duplicates in integer array when numbers are > 0 and less than n
     * @Constraint you must do this in O(n) time and O(1) space
     * */

    /**
     * @Example
     * [1,2,3,2,4,5,6,5]
     * [2,5] printed not to use extra space
     * */

    public void findDuplicates(int[] numbers){
        for(int i=0; i < numbers.length; i++){
            int mapKey = Math.abs(numbers[i]);
            if(numbers[mapKey] < 0){
                System.out.print(Math.abs(numbers[i]) + " ");
            }else {
                numbers[mapKey] = -numbers[mapKey];
            }
        }
    }
}
