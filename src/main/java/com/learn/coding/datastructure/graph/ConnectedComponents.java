package com.learn.coding.datastructure.graph;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SolutionConnected {

    final private List<List<Integer>> adjacencyList = new ArrayList<>();

    public int countComponents(int n, int[][] edges) {

        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }

        for (int[] edge : edges) {
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }

        int count = 0;

        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!seen.contains(i)) {
                dfs(i, seen);
                count++;
            }
        }
        return count;
    }

    private void dfs(int source, Set<Integer> seen){
        seen.add(source);
        for(int neigh: adjacencyList.get(source)){
            if(neigh == source) continue;
            dfs(neigh, seen);
        }
    }
}

public class ConnectedComponents {
    public static void main(String[] args) {
        SolutionConnected solutionConnected = new SolutionConnected();

        int [][] data = {{},{},{},{}};
    }
}
