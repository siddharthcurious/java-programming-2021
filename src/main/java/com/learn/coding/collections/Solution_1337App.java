package com.learn.coding.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Pair {

    private final int strengthCount;
    private final int index;

    public Pair(int strengthCount, int index){
        this.strengthCount = strengthCount;
        this.index = index;
    }

    public int getStrengthCount(){
        return strengthCount;
    }

    public int getIndex(){
        return index;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "strengthCount=" + strengthCount +
                ", index=" + index +
                '}';
    }
}

class Comp implements Comparator<Pair> {

    @Override
    public int compare(Pair o1, Pair o2) {
        if(o1.getStrengthCount() != o2.getStrengthCount()){
            return o1.getStrengthCount() - o2.getStrengthCount();
        }
        else {
            return o1.getIndex() - o2.getIndex();
        }
    }
}

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comp());

        for(int i = 0; i < mat.length; i++){
            int s = 0;
            for(int j = 0; j < mat[0].length; j++){
                s = s + mat[i][j];
            }
            Pair pair = new Pair(s, i);
            pq.offer(pair);
        }

        int [] res = new int[k];
        for(int p = 0; p < k; p++){
            Pair d = pq.poll();
            int ind = d.getIndex();
            res[p] = ind;
        }
        return res;
    }
}

public class Solution_1337App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [][] mat =
                {{1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}};
        int k = 3;
        int [] res = solution.kWeakestRows(mat, k);
        System.out.println(Arrays.toString(res));
    }
}
