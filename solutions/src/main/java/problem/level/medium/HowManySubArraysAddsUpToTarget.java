package problem.level.medium;

import java.util.HashMap;

public class HowManySubArraysAddsUpToTarget {
    /**
     * @Description
     * given an array of numbers and target, find out how many sub arrays adds up to target
     * - time complexity must be O(n)
     * */

    /**
     * @Example
     * input: [2,6,4,3,5,10,9], target = 9
     * output: []
     * */

    /**
     * @hint accumulative sum + hashing to store (sum, count: which is
     *       old count + count " usually 1 if no occurrences"
     *       which is stored in map to indicate a match )
     *
     *      original rule: accumSum[i] - accumSum[j] = 0 to match sub containing 0
     *      derived rule: accumSum[i] - accumSum[j] = k to match sub containing k
     * */

    public int numberOfSubArrayEqualsTarget(int[] numbers, int target) {
        int count = 0;
        int sum = 0;
        final HashMap<Integer,Integer> map = new HashMap <>();
        map.put(0, 1);

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (map.containsKey(sum - target)){
                count += map.get(sum - target);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
