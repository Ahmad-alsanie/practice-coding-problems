package problem.level.easy;

import java.util.*;

public class TopKFrequent {

    /**
     * Given an integer array nums and an integer k,
     * return the k most frequent elements.
     *
     * Example 1:
     *
     * Input: nums = [1,1,1,2,2,3], k = 2
     * Output: [1,2]
     * Example 2:
     *
     * Input: nums = [1], k = 1
     * Output: [1]
     * **/
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> frequency = new HashMap<>();

        Queue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for(int number: nums){
            if(frequency.containsKey(number)){
                frequency.put(number, frequency.get(number) + 1);
            }else{
                frequency.put(number, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry: frequency.entrySet()){
            minHeap.add(entry);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        for(int i = 0; i < k; i++){
            result[i] = minHeap.poll().getKey();
        }
        return result;
    }
}
