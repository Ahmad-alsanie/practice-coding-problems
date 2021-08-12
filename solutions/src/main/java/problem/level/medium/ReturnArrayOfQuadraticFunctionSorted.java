package problem.level.medium;

public class ReturnArrayOfQuadraticFunctionSorted {

    /**
     * @Description
     * Given a sorted integer array nums and three integers a, b and c,
     * apply a quadratic function of the form f(x) = ax2 + bx + c to each element nums[i] in the array, and return the array in a sorted order.
     * */

    /**
     * @Example
     * Input: nums = [-4,-2,2,4], a = 1, b = 3, c = 5
     * Output: [3,9,15,33]
     * */

    /**
     * @Constraints
     * 1 <= nums.length <= 200
     * -100 <= nums[i] <= 100
     * a must be positives
     * nums is sorted in ascending order.
     * */

    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {

        if(null == nums || nums.length == 0){
            throw new IllegalArgumentException("Empty or null array");
        }

        if(nums.length == 1){
            nums[0] = a*(nums[0]*nums[0]) + b*nums[0] +c;
            return nums;
        }

        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[nums.length];
        int whereToInsert = end;

        while(start <= end){
            int leftQuadratic = a*(nums[start]*nums[start]) + b*nums[start] + c;
            int rightQuadratic = a*(nums[end]*nums[end]) + b*nums[end] + c;
            if(leftQuadratic > rightQuadratic){
                result[whereToInsert--] = leftQuadratic;
                start++;
            }else{
                result[whereToInsert--] = rightQuadratic;
                end--;
            }
        }
        return result;
    }

}
