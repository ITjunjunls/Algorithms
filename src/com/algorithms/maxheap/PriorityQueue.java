package com.algorithms.maxheap;

import com.algorithms.queue.Queue;

/**
 * @author itjunjun  2021/5/10 9:30
 */
public class PriorityQueue<E extends Comparable<E>> implements Queue<E> {

    private MaxHeap<E> maxHeap;

    public PriorityQueue(){
        maxHeap = new MaxHeap<>();
    }

    @Override
    public int getSize() {
        return maxHeap.size();
    }

    @Override
    public boolean isEmpty() {
        return maxHeap.isEmpty();
    }

    @Override
    public E dequeue() {
        return maxHeap.extractMax();
    }

    @Override
    public void enqueue(E e) {
        maxHeap.add(e);
    }

    @Override
    public E getFront() {
        return maxHeap.findMax();
    }
}
