package com.algorithms.set;

/**
 * @author itjunjun  2021/4/28 9:42
 */
public interface Set<E> {

    void add(E e);
    void remove(E e);
    boolean contains(E e);
    int getSize();
    boolean isEmpty();
}
