package problem.level.easy;

public class NumberOfEvenDigitsEntries {

    /**
     * @Description
     * Find the number of even digits' entry in a giving integer array
     * */

    /**
     * @Example
     * input: [0,12,3,4,0,5,1562]
     * output: 2
     *
     * entries [12] and [1562] are entries of an even digit number
     * */

    /**
     * @Constraints
     * entry array[n] >=0
     * 0 < array.length < 500
     * */

    public int findNumberOfEvenDigits(final int[] numbers){
        int numberOfEvenDigits = 0;
        for(int number: numbers){
            int currentDigitCount = 1;
            while(number / 10 >= 1){
                number /= 10;
                currentDigitCount++;
            }
            if(currentDigitCount % 2 == 0){
                numberOfEvenDigits++;
            }
        }
        return numberOfEvenDigits;
    }
}
