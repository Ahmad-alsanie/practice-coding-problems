package problem.level.easy;

public class RemoveDuplicatesInPlaceAndReturnIndexOfLastElementWithoutDuplicates {
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
        int length = nums.length;
        if(length == 0)
            return 0;
        int next = 1;
        int start = nums[0];
        for(int i = 1; i < length; i++){
            if(nums[i] != start){
                start = nums[i];
                nums[next] = nums[i];
                next++;
            }
        }
        return next;
    }
}
