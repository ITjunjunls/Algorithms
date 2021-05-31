package com.algorithms.unionfind;

/**
 * @author itjunjun  2021/5/31 20:56
 */
public interface UnionFind {

    boolean isConnected(int p, int q);

    void UnionElements(int p, int q);

    int getSize();
}
