package problem.level.easy;

public class LongestConsecutiveOccurrences {

    /**
     * @Description
     * find the longest consecutive occurrences of a given character c in a given string str
     * */

    /**
     * @Example
     * input: "aabbaaaaabcxaaaaaaa"
     * output: 7
     * */

    public int findLongestConsecutive(final String input, final char c){
        int maxCount = 0;
        int currentCount = 0;
        for(char current : input.toCharArray()){
            if(current == c){
                currentCount++;
                maxCount = Math.max(currentCount, maxCount);
            }else {
                currentCount = 0;
            }
        }
        return Math.max(maxCount, currentCount);
    }

}
