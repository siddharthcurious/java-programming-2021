package com.learn.coding.trick;


import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Edge{
    private int x;
    private int y;
    private int cost;

    public Edge(int x, int y, int cost){
        this.x = x;
        this.y = y;
        this.cost = cost;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

public class PriorityQueueApp {
    public static void main(String[] args) {
        Queue<Edge> queue = new PriorityQueue<Edge>((a, b)-> a.getCost() - b.getCost());
        PriorityQueue<Edge> pq = new PriorityQueue<>((x, y) -> x.getCost() - y.getCost());

        int [][] connections = new int[5][];
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>(Comparator.comparingInt(a -> a[2]));
        Collections.addAll(heap, connections);
    }
}
