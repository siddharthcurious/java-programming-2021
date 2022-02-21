package com.learn.coding.datastructure.disjointset;

import java.util.Arrays;

class Disjoint {

    final private int [] root;

    public Disjoint(int size){
        root = new int[size];
        for(int i = 0; i < size; i++){
            root[i] = i;
        }
    }

    public int find(int node){
        while(node != root[node]){
            node = root[node];
        }
        return node;
    }

    public void union(int node1, int node2){
        int root1 = find(node1);
        int root2 = find(node2);
        if(root1 != root2){
            root[node2] = root1;
        }
    }

    public void print(){
        System.out.println(Arrays.toString(root));
    }
}

public class QuickUnionDisjointSetApp {
    public static void main(String[] args) {

        Disjoint disjoint = new Disjoint(10);

        disjoint.print();

        disjoint.union(0,1);
        disjoint.union(1,2);
        disjoint.union(2,3);
        disjoint.union(3,4);
        disjoint.union(4,5);
        disjoint.union(5,6);

        disjoint.print();
    }
}
