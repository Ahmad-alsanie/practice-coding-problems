package problem.level.easy;

import java.util.PriorityQueue;

public class KthSmallestElement {
    /**
     * @Description
     * find the kth smallest element in an array of numbers
     * */

    /**
     * @Example
     * input: [4,5,3,6,14,10,66] find 3rd smallest element
     * output: 5
     * */

    public int findKthSmallest(int[] numbers, int k){
        PriorityQueue<Integer> maximumHeap = new PriorityQueue<>((a,b)->b-a);

        if(null == numbers || numbers.length == 0 || k > numbers.length){
            throw new IllegalArgumentException();
        }

        for(int number: numbers){
            maximumHeap.add(number);
            if(maximumHeap.size() > k){
                maximumHeap.poll();
            }
        }
        return maximumHeap.poll();
    }
}
