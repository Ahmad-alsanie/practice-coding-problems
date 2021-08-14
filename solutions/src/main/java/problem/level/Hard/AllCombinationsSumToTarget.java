package problem.level.Hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllCombinationsSumToTarget {
    /**
     * @Description
     * find out all combination in a given array that adds up to a target (duplicates included)
     * */

    /**
     * @Example
     * input: [1,2,3] target = 3
     * output: [1,2], [2,1], [3]
     * */

    public List<List<Integer>> combinations(int[] numbers, int target){
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> currentCombo = new LinkedList<>();
        backtrack(numbers, result, currentCombo, 0, target);
        return result;
    }

    private void backtrack(int[] numbers, List<List<Integer>> result,
                           LinkedList<Integer> currentCombo, int start, int target) {
        if(target == 0){
            result.add(new LinkedList<>(currentCombo));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = start; i < numbers.length; i++){
            currentCombo.add(numbers[i]);
            backtrack(numbers, result, currentCombo, i,target - numbers[i]);
            currentCombo.removeLast();
        }
    }
}
