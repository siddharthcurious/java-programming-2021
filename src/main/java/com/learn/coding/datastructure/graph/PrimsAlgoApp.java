package com.learn.coding.datastructure.graph;

import java.util.PriorityQueue;

class Solution_1584 {
    public int minCostConnectPoints(int[][] points) {
        final int N = points.length;
        if (N <= 1) return 0;
        int connected = N, res = 0;

        PriorityQueue<Edge> minHeap = new PriorityQueue<>((e1, e2) -> Integer.compare(e1.dist, e2.dist));

        boolean[] visited = new boolean[N];
        int i = 0;
        while (connected > 1) {
            visited[i] = true;
            for (int j = 0; j < N; j++) {
                if (!visited[j]) {
                    Edge edge = new Edge(i, j, dist(points[i], points[j]));
                    minHeap.add(edge);
                }
            }
            while (visited[minHeap.peek().y]) {
                minHeap.poll();
            }
            Edge minEdge = minHeap.poll();
            res += minEdge.dist;
            i = minEdge.y;
            connected--;
        }
        return res;
    }

    private int dist(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }

    class Edge {
        int x, y;
        int dist;
        Edge(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}

public class PrimsAlgoApp {
    public static void main(String[] args) {
        Solution_1584 solution = new Solution_1584();

        int [][] points = {{3,12},{-2,5},{-4,1}};
        //int [][] points1 = {{0,0},{1,1},{1,0},{-1,1}};
        int [][] p = {{0,0},{2,2},{3,10},{5,2},{7,0}};

        int cost = solution.minCostConnectPoints(p);

        System.out.println(cost);
    }
}
