package com.learn.coding.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

class Edge {
    final private int x;
    final private int y;
    final private int cost;

    public Edge(int x, int y, int cost){
        this.x = x;
        this.y = y;
        this.cost = cost;
    }

    public int getCost(){
        return cost;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "x=" + x +
                ", y=" + y +
                ", cost=" + cost +
                '}';
    }
}

class UnionFind {

    final private int [] root;
    private int connected;

    public UnionFind(int size){
        root = new int[size];
        for(int i = 0; i < size; i++){
            root[i] = i;
        }
        connected = size;
    }

    public int find(int x){
        return root[x];
    }

    public void union(int node1, int node2){
        int root1 = find(node1);
        int root2 = find(node2);
        if(root1 != root2){
            for(int i = 0; i < root.length; i++){
                if(root[i] == root2){
                    root[i] = root1;
                }
            }
        }
        connected--;
    }

    public boolean isConnected(){
        return connected == 1;
    }
}

class Solution_1584 {

    public int minCostConnectPoints(int[][] points) {

        int minCost = 0;
        int n = points.length;

        Queue<Edge> pq = new PriorityQueue<>((a, b) -> a.getCost()- b.getCost());

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                if(i != j) {
                    int cost = Math.abs(points[i][0] - points[j][0]) +
                               Math.abs(points[i][1] - points[j][1]);

                    Edge edge = new Edge(i, j, cost);
                    pq.offer(edge);
                }
            }
        }

        UnionFind unionFind = new UnionFind(n);

        while (!unionFind.isConnected()){
            Edge e = pq.poll();
            if(unionFind.find(e.getX()) != unionFind.find(e.getY())){
                unionFind.union(e.getX(), e.getY());
                minCost += e.getCost();
            }
        }
        return minCost;
    }
}
public class Solution_1584App {
    public static void main(String[] args) {
        Solution_1584 solution = new Solution_1584();

        int [][] points = {{3,12},{-2,5},{-4,1}};
        //int [][] points1 = {{0,0},{1,1},{1,0},{-1,1}};
        int [][] p = {{0,0},{2,2},{3,10},{5,2},{7,0}};

        int cost = solution.minCostConnectPoints(p);

        System.out.println(cost);
    }
}
