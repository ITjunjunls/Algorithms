package com.algorithms.stack;

/**
 * @author itjunjun  2021/4/17 9:57
 */
public interface Stack<E> {
    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();
}
