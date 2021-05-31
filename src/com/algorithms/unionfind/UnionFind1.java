package com.algorithms.unionfind;

/**
 * @author itjunjun  2021/5/31 21:02
 * 这个类主要是简单实现并查集的思路，检查两个节点是否连接，看他们的集合ID是否相同，合并操作则是把两个对应不同集合ID修改为一样的
 */
public class UnionFind1 implements UnionFind {

    private int[] id;

    public UnionFind1(int size) {
        id = new int[size];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public void UnionElements(int p, int q) {
        int pID = find(p);
        int qID = find(q);

        if (pID == qID) {
            return;
        }
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) {
                id[i] = qID;
            }
        }
    }

    @Override
    public int getSize() {
        return id.length;
    }

    /**
     * 查找元素P所对应的集合编号
     *
     * @param p
     * @return
     */
    private int find(int p) {
        if (p < 0 || p >= id.length) {
            throw new IllegalArgumentException("p is out of bound");
        }
        return id[p];
    }
}
