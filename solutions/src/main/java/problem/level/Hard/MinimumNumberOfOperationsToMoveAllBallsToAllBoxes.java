package problem.level.hard;

public class MinimumNumberOfOperationsToMoveAllBallsToAllBoxes {
    /**
     * @Description
     * You have n boxes. You are given a binary string boxes of length n, where boxes[i]
     * is '0' if the ith box is empty, and '1' if it contains one ball.
     * In one operation, you can move one ball from a box to an adjacent box.
     * Box i is adjacent to box j if abs(i - j) == 1. Note that after doing so,
     * there may be more than one ball in some boxes.
     * Return an array answer of size n, where answer[i] is the minimum number of operations needed
     * to move all the balls to the ith box.
     * Each answer[i] is calculated considering the initial state of the boxes.
     * */
    /**
     * @Example
     * Input: boxes = "110"
     * [1 operation ]moving all balls to index 0 since we only need to move 1 ball
     * [1 operation]moving all balls to index 1 since we only have to move 1 ball
     * [3 operations] moving all balls to index 2 since we have to move 2 balls (first ball will take 2 step and second will take 1)
     * Output: [1,1,3]
     * Explanation: The answer for each box is as follows:
     * 1) First box: you will have to move one ball from the second box to the first box in one operation.
     * 2) Second box: you will have to move one ball from the first box to the second box in one operation.
     * 3) Third box: you will have to move one ball from the first box to the
     * third box in two operations, and move one ball from the second box to the third box in one operation.
     * Example 2:
     *
     * Input: boxes = "001011"
     * Output: [11,8,5,4,3,4]/
     * */

    /**
     * @Hint
     * - you want to move a ball from box i to box j, you'll need abs(i-j) moves
     * - use a greedy algorithm to scan and update a resulted array in 2 loops
     * - for each box i, iterate on each ball in a box j, and add abs(i-j) to answers[i].
     * */

    public int[] minOperations(String boxes) {
        int [] result = new int[boxes.length()];
        for(int i=0; i < boxes.length(); i++){
            int steps = 0;
            for(int j=0;j<boxes.length();j++){
                if(i != j && boxes.charAt(j) == '1'){
                    steps = steps+(Math.abs(i-j));
                }
            }
            result[i] = steps;
        }

        return result;
    }
}
