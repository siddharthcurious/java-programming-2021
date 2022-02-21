package com.learn.coding.datastructure.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public enum Colour {
        RED,
        BLUE
    }

    public boolean isBipartite(int[][] graph) {
        HashMap<Integer, Colour> colours = new HashMap<>();
        for (int vertex = 0; vertex < graph.length; vertex++) {
            if (!colours.containsKey(vertex)) {
                Queue<Integer> q = new LinkedList<>();
                q.add(vertex);
                colours.put(vertex, Colour.RED);
                while (!q.isEmpty()) {
                    int currentVertex = q.remove();
                    // Search adjusent vertexes
                    for(int adjVertex: graph[currentVertex]) {
                        if (!colours.containsKey(adjVertex)) {
                            if (colours.get(currentVertex) == Colour.RED) {
                                colours.put(adjVertex, Colour.BLUE);
                            } else {
                                colours.put(adjVertex, Colour.RED);
                            }
                            q.add(adjVertex);
                        } else if (colours.get(adjVertex) == colours.get(currentVertex)) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}

public class BipartiteGraphApp {
    public static void main(String[] args) {

    }
}
