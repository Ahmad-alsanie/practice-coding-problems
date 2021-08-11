package problem.level.easy;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ReturnArrayOfSquaresSorted {
    /**
     * @Description
     * Given an integer array nums sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * */

    /**
     * @Constraints
     * 1 <= nums.length <= 104
     * -104 <= nums[i] <= 104
     * nums is sorted in non-decreasing order.
     * */

    /**
     * @Example
     * Input: nums = [-7,-3,2,3,11]
     * Output: [4,9,9,49,121]
     * */

    //Solution 1: time= O(n * log n)  space= O(n)
    public int[] sortedSquares(int[] numbers) {
        final PriorityQueue<Integer> minimumHeap = new PriorityQueue<Integer>();
        for(int number : numbers){
            int sqrt = number * number;
            minimumHeap.add(sqrt);
        }
        int i =0;
        while(!minimumHeap.isEmpty()){
            numbers[i] = minimumHeap.poll();
            i++;
        }
        return numbers;
    }

    //Solution 2: time= O(n * log n) space= O(log n) since Arrays.sort uses quicksort
    public int[] sortedSquaresSpaceOptimized(int[] numbers) {
        int i = 0;
        for(int number : numbers){
            numbers[i] = number * number;
            i++;
        }
        Arrays.sort(numbers);
        return numbers;
    }

    //Solution 3: time= O(n) space= O(n)
    public int[] sortedSquaresTimeOptimized(int[] numbers) {
        int [] result = new int[numbers.length];
        int start = 0;
        int end = numbers.length - 1;
        int whereToInsert = end; // insert position.

        while (start <= end) { // <  or <=  ?   be careful about ==
            int sqrtLeft = numbers[start] * numbers[start];
            int sqrtRight = numbers[end] * numbers[end];

            if (sqrtLeft > sqrtRight) {
                result[whereToInsert--] = sqrtLeft;
                start++;
            } else {
                result[whereToInsert--] = sqrtRight;
                end--;
            }
        }

        return result;
    }
}
