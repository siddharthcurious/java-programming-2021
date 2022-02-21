package com.learn.coding.datastructure.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class AdjacencyGraph {

    private Map<Integer, Set<Integer>> graph;

    public AdjacencyGraph(){
        graph = new HashMap<>();
    }

    public void addEdge(int source, int dest){
        if(graph.containsKey(source)){
            graph.get(source).add(dest);
        }
        else {
            Set<Integer> set = new HashSet<>();
            set.add(dest);
            graph.put(source, set);
        }
    }

    public Map<Integer, Set<Integer>> getGraph() {
        return graph;
    }
}

class GraphTraversal {
    public void dfs(AdjacencyGraph graph, int source, Set<Integer> visited){
        visited.add(source);
        System.out.println(source);

        if(graph.getGraph().containsKey(source)) {
            for (Integer neigh : graph.getGraph().get(source)) {
                if (!visited.contains(neigh)) {
                    dfs(graph, neigh, visited);
                }
            }
        }
    }
}

public class DFSApplication {
    public static void main(String[] args) {

        AdjacencyGraph adjacencyGraph = new AdjacencyGraph();
        adjacencyGraph.addEdge(0,1);
        adjacencyGraph.addEdge(0,2);
        adjacencyGraph.addEdge(0,3);
        adjacencyGraph.addEdge(1,2);
        adjacencyGraph.addEdge(1,4);
        adjacencyGraph.addEdge(2,4);
        adjacencyGraph.addEdge(2,5);
        adjacencyGraph.addEdge(2,7);
        adjacencyGraph.addEdge(2,8);
        adjacencyGraph.addEdge(3,8);
        adjacencyGraph.addEdge(4,5);
        adjacencyGraph.addEdge(5,6);

        GraphTraversal graphTraversal = new GraphTraversal();

        Set<Integer> visited = new HashSet<>();
        graphTraversal.dfs(adjacencyGraph, 0, visited);

    }
}
