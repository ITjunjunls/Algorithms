package com.algorithms.unionfind;

/**
 * @author itjunjun  2021/6/1 22:16
 * 之所以做这个优化，是因为如果默认把p的集合指向q的集合的话，容易造成一个集合的树结构高度很大，不利于后期查找，因为isConnected方法复杂度主要基于深度
 * 所以为了降低树的深度，对这些集合进行比较之后再确定哪个指向另一个
 * 但是这里还有缺点，就是比较的是两棵树的节点数目，节点数目多高度不一定大，数目少不一定高度小，所以还要针对高度进行优化
 */
public class UnionFind3 implements UnionFind{

    private int[] parent;
    //sz[i]表示以i为根的集合中元素的个数
    private int[] sz;

    public UnionFind3(int size) {
        parent = new int[size];
        sz = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
            sz[i] = 1;
        }
    }

    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    /**
     * 根据两个元素所在树的元素个数不同判断合并方向
     * 将元素个数少的集合合并到元素个数多的集合上
     * @param p
     * @param q
     */
    @Override
    public void unionElements(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if(qRoot == pRoot){
            return;
        }
        if(sz[pRoot] < sz[qRoot]){
            parent[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        }else {
            parent[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }

    }

    @Override
    public int getSize() {
        return parent.length;
    }

    private int find(int p) {
        if (p < 0 || p >= parent.length) {
            throw new IllegalArgumentException("p is out of bound");
        }
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }
}
