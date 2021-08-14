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
