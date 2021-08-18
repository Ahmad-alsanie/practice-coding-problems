package problem.level.hard;

import java.util.Map;
import java.util.TreeMap;

public class GoodStartsForOddEvenJumps {

    /**
     * @Description
     * You are given an integer array arr. From some starting index, you can make a series of jumps. The (1st, 3rd, 5th, ...) jumps in the series are called odd-numbered jumps, and the (2nd, 4th, 6th, ...) jumps in the series are called even-numbered jumps. Note that the jumps are numbered, not the indices.
     *
     * You may jump forward from index i to index j (with i < j) in the following way:
     *
     * During odd-numbered jumps (i.e., jumps 1, 3, 5, ...), you jump to the index j such that arr[i] <= arr[j] and arr[j] is the smallest possible value. If there are multiple such indices j, you can only jump to the smallest such index j.
     * During even-numbered jumps (i.e., jumps 2, 4, 6, ...), you jump to the index j such that arr[i] >= arr[j] and arr[j] is the largest possible value. If there are multiple such indices j, you can only jump to the smallest such index j.
     * It may be the case that for some index i, there are no legal jumps.
     * A starting index is good if, starting from that index, you can reach the end of the array (index arr.length - 1) by jumping some number of times (possibly 0 or more than once).
     *
     * Return the number of good starting indices.
     * */

    /**
     * @Rules
     * - If you jumped odd then jump even
     * - If you first jumped even then jump odd
     * - The index you jump from should be less than the index you jump to
     * - Only jump forward
     * - During odd jumps you must jump to a value greater than or equal to the value you jumped from
     * - If there’re multiple values greater than or equal to ur current value then you have to pick smallest value
     * - If there’re multiple smallest value e.g. 2 equal values then jump to smallest index
     * - For even jumps you can only jumps to values that are less or equal to your current value
     * - Also jump for the largest value that’s smaller or equal to ur current value
     * - You can start at any index and starting index is good if you reach the end. How many good starts are there ?
     * */

    /**
     * @Example
     * Input: arr = [10,13,12,14,15]
     * Output: 2
     * Explanation:
     * From starting index i = 0, we can make our 1st jump to i = 2 (since arr[2] is the smallest among arr[1], arr[2], arr[3], arr[4] that is greater or equal to arr[0]), then we cannot jump any more.
     * From starting index i = 1 and i = 2, we can make our 1st jump to i = 3, then we cannot jump any more.
     * From starting index i = 3, we can make our 1st jump to i = 4, so we have reached the end.
     * From starting index i = 4, we have reached the end already.
     * In total, there are 2 different starting indices i = 3 and i = 4, where we can reach the end with some number of
     * jumps.
     *
     * Input: arr = [2,3,1,1,4]
     * Output: 3
     * Explanation:
     * From starting index i = 0, we make jumps to i = 1, i = 2, i = 3:
     * During our 1st jump (odd-numbered), we first jump to i = 1 because arr[1] is the smallest value in [arr[1], arr[2], arr[3], arr[4]] that is greater than or equal to arr[0].
     * During our 2nd jump (even-numbered), we jump from i = 1 to i = 2 because arr[2] is the largest value in [arr[2], arr[3], arr[4]] that is less than or equal to arr[1]. arr[3] is also the largest value, but 2 is a smaller index, so we can only jump to i = 2 and not i = 3
     * During our 3rd jump (odd-numbered), we jump from i = 2 to i = 3 because arr[3] is the smallest value in [arr[3], arr[4]] that is greater than or equal to arr[2].
     * We can't jump from i = 3 to i = 4, so the starting index i = 0 is not good.
     * In a similar manner, we can deduce that:
     * From starting index i = 1, we jump to i = 4, so we reach the end.
     * From starting index i = 2, we jump to i = 3, and then we can't jump anymore.
     * From starting index i = 3, we jump to i = 4, so we reach the end.
     * From starting index i = 4, we are already at the end.
     * In total, there are 3 different starting indices i = 1, i = 3, and i = 4, where we can reach the end with some
     * number of jumps.
     *
     * Input: arr = [5,1,3,4,2]
     * Output: 3
     * Explanation: We can reach the end from starting indices 1, 2, and 4.
     * */

    /**
     * @CodeExplaination
     * We need to jump higher and lower alternately to the end.
     *
     * Take [5,1,3,4,2] as example.
     *
     * If we start at 2,
     * we can jump either higher first or lower first to the end,
     * because we are already at the end.
     * higher(2) = true
     * lower(2) = true
     *
     * If we start at 4,
     * we can't jump higher, higher(4) = false
     * we can jump lower to 2, lower(4) = higher(2) = true
     *
     * If we start at 3,
     * we can jump higher to 4, higher(3) = lower(4) = true
     * we can jump lower to 2, lower(3) = higher(2) = true
     *
     * If we start at 1,
     * we can jump higher to 2, higher(1) = lower(2) = true
     * we can't jump lower, lower(1) = false
     *
     * If we start at 5,
     * we can't jump higher, higher(5) = false
     * we can jump lower to 4, lower(5) = higher(4) = false
     * */

    //Time O(NlogN)
    //Space O(N)
    public int oddEvenJumps(int[] numbers) {
        int n  = numbers.length;
        int result = 1; // if you start at last index there's always at least one place where you reach the end so by default answer is 1

        //odd even jumps capabilities
        boolean[] higher = new boolean[n];
        boolean[] lower = new boolean[n];

        higher[n - 1] = lower[n - 1] = true;//always reached the end from last element

        final TreeMap<Integer, Integer> tree = new TreeMap<>();

        tree.put(numbers[n - 1], n - 1);

        for (int i = n - 2; i >= 0; --i) {
            Map.Entry<Integer, Integer> highJumpValue = tree.ceilingEntry(numbers[i]);
            Map.Entry<Integer, Integer> lowJumpValue = tree.floorEntry(numbers[i]);

            if (highJumpValue != null) {
                higher[i] = lower[highJumpValue.getValue()];
            }
            if (lowJumpValue != null) {
                lower[i] = higher[lowJumpValue.getValue()];
            }

            if (higher[i]) {
                result++;
            }
            tree.put(numbers[i], i);
        }
        return result;
    }
}
