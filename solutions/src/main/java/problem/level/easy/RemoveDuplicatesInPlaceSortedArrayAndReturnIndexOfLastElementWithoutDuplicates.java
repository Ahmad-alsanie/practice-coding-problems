package problem.level.easy;

public class RemoveDuplicatesInPlaceSortedArrayAndReturnIndexOfLastElementWithoutDuplicates {
    /**
     * @Description
     * shift duplicates to the end of the array and return index of last element
     * that would create a sub array of non duplicate values
     * - space complexity must be O(1) and time O(n)
     * - sorted array
     * */

    /**
     * @Example
     * input[1,2,3,3,4,4,14] -> [1,2,3,4,14]
     * output: 4
     * */

    /**
     * @Hint
     * same idea of moving zeros with an extra variable to switch
     * */

    public int removeDuplicates(int[] nums) {
        int previous = 0;
        for(int i=0; i < nums.length; i++){
            if(nums[i] != nums[previous]){
                previous++;
                nums[previous] = nums[i];
            }
        }
        return previous+1;
    }
}
