package com.algorithms.maxheap;


import java.util.LinkedList;
import java.util.TreeMap;
import java.util.PriorityQueue;

/**
 * @author itjunjun  2021/5/10 9:50
 */
public class Solution347 {

    private class Freq implements Comparable<Freq> {
        public int e, freq;

        public Freq(int e, int freq) {
            this.e = e;
            this.freq = freq;
        }

        @Override
        public int compareTo(Freq another) {
            if (this.freq < another.freq) {
                return -1;
            } else if (this.freq > another.freq) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public int[] topKFrequent(int[] nums, int k) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        PriorityQueue<Freq> priorityQueue = new PriorityQueue<>();
        for (int key : map.keySet()) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(new Freq(key, map.get(key)));
            } else if (map.get(key) > priorityQueue.peek().freq) {
                priorityQueue.remove();
                priorityQueue.add(new Freq(key, map.get(key)));
            }
        }
        LinkedList<Integer> res = new LinkedList<>();
        int[] arr = new int[priorityQueue.size()];
        int i = 0;
        while (!priorityQueue.isEmpty()) {
            arr[i] = priorityQueue.remove().e;
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, -1, 2, -1, 2, 3};
        Solution347 solution347 = new Solution347();
        int[] res = solution347.topKFrequent(nums, 2);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
