package problem.level.medium;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays {
    /**
     * @Description
     * Given two integer arrays nums1 and nums2, return an array of their intersection.
     * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
     * */

    /**
     * Example
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [4,9]
     * */

    /**
     * @Constraints
     * 1 <= nums1.length, nums2.length <= 1000
     * 0 <= nums1[i], nums2[i] <= 1000
     * */


    //O(m+n)
    public int[] intersect(int[] nums1, int[] nums2) {
        if(null == nums1 || null == nums2){
            throw new IllegalArgumentException("received array cannot be null");
        }

        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int number : nums1) {
            frequency.put(number, frequency.getOrDefault(number, 0) + 1);
        }
        int current = 0;
        for (int number : nums2) {
            if (frequency.containsKey(number) && frequency.get(number) > 0) {
                nums1[current] = number;
                frequency.put(number, frequency.get(number) - 1);
                current++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, current);
    }
}
