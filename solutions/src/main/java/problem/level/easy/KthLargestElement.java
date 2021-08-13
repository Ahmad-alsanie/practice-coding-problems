package problem.level.easy;

import java.util.PriorityQueue;

public class KthLargestElement {

    /**
     * @Description
     * find Kth largest element in an array of numbers
     * */

    /**
     * @Example
     * input: [4,5,3,6,14,10,66] find 3rd largest element
     * output: 10
     * */

    public int findKthLargest(int[] numbers, int k){
        PriorityQueue<Integer> minimumHeap = new PriorityQueue<>((a,b)->a-b);

        if(null == numbers || numbers.length == 0 || k > numbers.length){
            throw new IllegalArgumentException();
        }

        for(int number : numbers){
            minimumHeap.add(number);
            if(minimumHeap.size() > k){
                minimumHeap.poll();
            }
        }
        return minimumHeap.poll();
    }
}
