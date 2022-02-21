package com.learn.coding.datastructure.graph;

import java.util.*;

class Solution001 {
    public class Graph {
        private Map<Integer, List<Integer>> graph;

        /* Create Directed Graph of N vertices. */
        public Graph(int N) {
            graph = new HashMap<>();
            for (int i = 0; i < N; i += 1) {
                graph.put(i, new ArrayList<>());
            }
        }

        public void addVertex(int from, int to) {
            graph.get(from).add(to);
        }

        /* Returns the Adjacency List of V. */
        public Iterable<Integer> neighbors(int v) {
            return graph.get(v);
        }

        /* Returns all the vertices in this Graph. */
        public Iterable<Integer> vertices() {
            return graph.keySet();
        }
    }

    private boolean canFinish = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        /* Create Directed Graph of courses. */
        Graph G = buildGraph(numCourses, prerequisites);

        /* Keep track of whether a vertex is being visited or it is done being visited. */
        Set<Integer> visiting = new HashSet<>();
        Set<Integer> done = new HashSet<>();

        /* DFS on each course to check if it can be finished or not. */
        for (int v : G.vertices()) {
            dfs(v, G, visiting, done);
            if (!canFinish) return false;
        }

        return true;
    }

    /* DFS: There's a cylce if a vertex is in visiting but is not in done. */
    public void dfs(int v, Graph G, Set<Integer> visiting, Set<Integer> done) {
        if (visiting.contains(v) && !done.contains(v)) {
            canFinish = false; return;
        }

        /* Mark current vertex as visiting, then DFS it's neighbors. */
        visiting.add(v);
        for (int n : G.neighbors(v)) {
            /* If neighbor already visited, there's a cycle. */
            if (visiting.contains(n)) {
                canFinish = false; return;
            }
            /* Only DFS the neighbor if it isn't done yet. */
            else if (!done.contains(n)) {
                dfs(n, G, visiting, done);
            }
        }

        /* Unmark this vertex as visiting and mark it as done. */
        visiting.remove(v);
        done.add(v);
    }


    /* Returns a Directed Graph of N vertices. The directed edge between vertex U and V
        means you must take course V in order to take course U. */
    public Graph buildGraph(int n, int[][] edges) {
        Graph G = new Graph(n);

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            G.addVertex(u, v);
        }

        return G;
    }
}
public class CourseScheduleAppCopy {
}
