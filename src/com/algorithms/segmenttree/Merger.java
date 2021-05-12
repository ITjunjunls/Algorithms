package com.algorithms.segmenttree;

/**
 * @author itjunjun  2021/5/12 9:50
 */
public interface Merger<E> {
    E merge(E a, E b);
}
