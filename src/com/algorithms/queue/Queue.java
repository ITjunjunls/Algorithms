package com.algorithms.queue;

/**
 * @author itjunjun  2021/4/18 18:00
 */
public interface Queue<E> {
    int getSize();

    boolean isEmpty();

    E dequeue(E e);

    void enqueue(E e);

    E getFront();
}
