package problem.level.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

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
    public int[] topKFrequent(int[] numbers, int k) {
        // O(1) time
        if (k == numbers.length) {
            return numbers;
        }

        // 1. build hash map : character and how often it appears
        // O(N) time
        Map<Integer, Integer> count = new HashMap<>();
        for (int n: numbers) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // init heap 'the less frequent element first'
        Queue<Integer> minHeap = new PriorityQueue<>();

        // 2. keep k top frequent elements in the heap
        // O(N log k) < O(N log N) time
        for (int n: count.keySet()) {
            minHeap.add(n);
            if (minHeap.size() > k) minHeap.poll();
        }

        // 3. build an output array
        // O(k log k) time
        int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = minHeap.poll();
        }
        return top;
    }
}
