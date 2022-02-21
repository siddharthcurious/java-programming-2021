package com.learn.coding.datastructure.disjointset;

import java.util.Arrays;

class UnionFind {

    private int[] root;

    public UnionFind(int size) {
        root = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i;
        }
    }

    public int find(int x) {
        return root[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            for (int i = 0; i < root.length; i++) {
                if (root[i] == rootY) {
                    root[i] = rootX;
                }
            }
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }

    public void print(){
        System.out.println(Arrays.toString(this.root));
    }
}

public class UnionFindApp {
    public static void main(String[] args) throws Exception {
        UnionFind uf = new UnionFind(10);
        uf.union(0, 1);
        uf.union(1, 2);
        uf.union(2, 3);
        uf.union(3, 4);

        uf.union(5, 6);
        uf.union(6, 7);
        uf.union(7, 8);
        uf.union(8, 9);
        uf.union(4, 5);

        uf.print();
    }
}
