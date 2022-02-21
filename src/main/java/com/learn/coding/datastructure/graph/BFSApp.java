package com.learn.coding.datastructure.graph;

import java.util.Arrays;
import java.util.LinkedList;

class Graph {
    private final int V;
    private final LinkedList<Integer>[] adj;

    public Graph(int v){
        this.V = v;
        adj = new LinkedList[this.V];
        for (int i = 0; i < this.V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int dest){
        adj[source].add(dest);
    }

    public void bfs(int source){
        boolean [] visited = new boolean[this.V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[source] = true;
        queue.add(source);

        while (queue.size() != 0){
            int node = queue.poll();

            for(Integer neigh: adj[node]){
                if(!visited[neigh]){
                    visited[neigh] = true;
                    queue.add(neigh);
                }
            }
        }

        System.out.println(Arrays.toString(visited));
    }
}

public class BFSApp {
    public static void main(String[] args) {

        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.bfs(2);
    }
}
