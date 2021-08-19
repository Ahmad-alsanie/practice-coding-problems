package problem.level.medium;

public class LongestSubArrayWithMaximumTwoUniqueValues {
    /**
     * @Description
     * You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
     *
     * You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
     *
     * You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
     * Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
     * Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
     * Given the integer array fruits, return the maximum number of fruits you can pick.
     * */

    /**
     * @Example
     * Input: fruits = [1,2,1]
     * Output: 3
     *
     * Input: fruits = [0,1,2,2]
     * Output: 3
     *
     * Input: fruits = [1,2,3,2,2]
     * Output: 4
     *
     * Input: fruits = [3,3,3,1,2,1,1,2,3,3,4]
     * Output: 5
     * */

    // Fruits in basket
    public int totalFruit(int[] fruits) {
        int result = 0;
        int current = 0;
        int basket = 0;
        int groupA = 0;
        int groupB = 0;
        for (int number :  fruits) {
            current = number == groupA || number == groupB ? current + 1 : basket + 1;
            basket = number == groupB ? basket + 1 : 1;
            if (groupB != number) {
                groupA = groupB;
                groupB = number;
            }
            result = Math.max(result, current);
        }
        return result;
    }
}
