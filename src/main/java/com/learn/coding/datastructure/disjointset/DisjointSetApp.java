package com.learn.coding.datastructure.disjointset;

import java.util.Arrays;

class DisjointSet {

    private final int [] root;

    public DisjointSet(int numberOfVertices){
        root = new int[numberOfVertices];
        for(int i = 0; i < numberOfVertices; i++){
            root[i] = i;
        }
    }

    public int find(int vertex){
        return root[vertex];
    }

    public void union(int vertex1, int vertex2){

        int root1 = find(vertex1);
        int root2 = find(vertex2);

        if(root1 != root2) {
            while(root1 != vertex1){
                vertex1 = find(root1);
            }
        }
        root[vertex2] = vertex1;
    }

    public void print(){
        System.out.println(Arrays.toString(root));
    }
}

public class DisjointSetApp {
    public static void main(String[] args) {

        DisjointSet disjointSet = new DisjointSet(10);

        disjointSet.print();

        disjointSet.union(0, 1);
        disjointSet.union(1, 2);
        disjointSet.union(2, 3);
        disjointSet.union(3, 4);

        disjointSet.union(5, 6);
        disjointSet.union(6, 7);
        disjointSet.union(7, 8);
        disjointSet.union(8, 9);

        disjointSet.union(4, 5);

        disjointSet.print();
    }
}
