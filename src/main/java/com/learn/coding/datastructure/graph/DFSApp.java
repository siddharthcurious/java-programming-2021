package com.learn.coding.datastructure.graph;

import java.util.Arrays;
import java.util.LinkedList;

class AdjGraph {

    private final int V;
    private LinkedList<Integer> [] adj;

    public AdjGraph(int V){
        this.V = V;
        adj = new LinkedList[this.V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int source, int dest){
        adj[source].add(dest);
    }
    private void dfsUtil(int source, boolean [] visited){
        visited[source] = true;
        for(Integer neigh: this.adj[source]){
            if(!visited[neigh]){
                dfsUtil(neigh, visited);
            }
        }
    }
    public void dfs(int source){
        boolean [] visited = new boolean[this.V];
        this.dfsUtil(source, visited);
        System.out.println(Arrays.toString(visited));
    }
}


public class DFSApp {
    public static void main(String[] args) {

        AdjGraph g = new AdjGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.dfs(0);

    }
}
