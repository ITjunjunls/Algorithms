package com.algorithms.unionfind;

import java.util.Random;

/**
 * @author itjunjun  2021/6/1 21:51
 */
public class Main {

    private static double testUF(UnionFind uf, int m) {
        int size = uf.getSize();
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < m; i++) {
            int a = random.nextInt(size);
            int b = random.nextInt(size);
            uf.unionElements(a, b);
        }
        for (int i = 0; i < m; i++) {
            int a = random.nextInt(size);
            int b = random.nextInt(size);
            uf.isConnected(a, b);
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        int size = 100000;
        int m = 100000;

        UnionFind1 unionFind1 = new UnionFind1(size);
        System.out.println("uf1:" + testUF(unionFind1, m) + "s");

        UnionFind2 unionFind2 = new UnionFind2(size);
        System.out.println("uf2:" + testUF(unionFind2, m) + "s");

        UnionFind3 unionFind3 = new UnionFind3(size);
        System.out.println("uf3:" + testUF(unionFind3, m) + "s");

        UnionFind4 unionFind4 = new UnionFind4(size);
        System.out.println("uf4:" + testUF(unionFind4, m) + "s");
    }
}
