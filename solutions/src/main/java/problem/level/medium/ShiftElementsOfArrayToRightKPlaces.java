package problem.level.medium;

public class ShiftElementsOfArrayToRightKPlaces {
    /**
     * @Description
     * Given an array, rotate the array to the right by k steps, where k is non-negative.
     * - must be done in O(n) time and O(1) space
     * */

    /**
     * @Example
     * Input: [1,2,3,4,5,6,7], k = 3
     * Output: [5,6,7,1,2,3,4]
     * */

    /**
     * @Hint
     * Cyclic Replacements:
     * We can directly place every number of the array at its required correct position.
     * But if we do that, we will destroy the original element.
     * Thus, we need to store the number being replaced in a temp variable.
     * Then, we can place the replaced number(\text{temp}temp) at its correct position and so on,
     * nn times, where nn is the length of array.
     * */

    public int[] rotate(int[] nums, int shifts) {
        shifts = shifts % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + shifts) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
        return nums;
    }

    //O(n) O(n) solution
    public int[] rotate2(int[] nums, int k) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
        return result;
    }
}
