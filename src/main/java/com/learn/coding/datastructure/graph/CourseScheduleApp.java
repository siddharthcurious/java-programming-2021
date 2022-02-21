package com.learn.coding.datastructure.graph;

import java.util.*;

class AGraph {

    private Map<Integer, List<Integer>> graph;
    public AGraph(int n){
        graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
    }

    public void addEdge(int source, int dest){
        graph.get(source).add(dest);
    }

    public Iterable<Integer> getPrerequisites(int node){
        return graph.get(node);
    }

    public Iterable<Integer> getVertices(){
        return graph.keySet();
    }
}

class GraphBuilder {
    public AGraph buildGraph(int n, int [][] edges){
        AGraph graph = new AGraph(n);
        for(int [] edge: edges){
            graph.addEdge(edge[0], edge[1]);
        }
        return graph;
    }
}

class Solution002 {

    private boolean canFinishFlag = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        GraphBuilder graphBuilder = new GraphBuilder();
        AGraph aGraph = graphBuilder.buildGraph(numCourses, prerequisites);

        Set<Integer> visiting = new HashSet<>();
        Set<Integer> done = new HashSet<>();

        for (int v : aGraph.getVertices()) {
            dfs(v, aGraph, visiting, done);
            if (!canFinishFlag) return false;
        }
        return true;
    }

    public void dfs(int v, AGraph graph, Set<Integer> visiting, Set<Integer> done) {
        if (visiting.contains(v) && !done.contains(v)) {
            canFinishFlag = false;
            return;
        }
        visiting.add(v);
        for (int n : graph.getPrerequisites(v)) {
            if (visiting.contains(n)) {
                canFinishFlag = false;
                return;
            } else if (!done.contains(n)) {
                dfs(n, graph, visiting, done);
            }
        }
        visiting.remove(v);
        done.add(v);
    }
}

public class CourseScheduleApp {
    public static void main(String[] args) {

    }
}
