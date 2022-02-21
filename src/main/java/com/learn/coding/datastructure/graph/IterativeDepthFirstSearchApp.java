package com.learn.coding.datastructure.graph;

import java.util.*;

class GraphTravel {

    private final List<List<Integer>> adjacencyList;

    GraphTravel(int n){
        adjacencyList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int dest){
        adjacencyList.get(source).add(dest);
        adjacencyList.get(dest).add(source);
    }

    public void printAdjacency(){
        System.out.println(adjacencyList);
    }

    public boolean dfsDetectCycle(int source){

        Stack<Integer> stack = new Stack<>();
        stack.push(source);

        Set<Integer> seen = new HashSet<>();
        seen.add(source);

        while(!stack.isEmpty()){
            int node = stack.pop();

            for(int neigh: adjacencyList.get(node)){
                if(seen.contains(neigh)){
                    return true;
                }
                stack.push(neigh);
                seen.add(neigh);

                if(adjacencyList.get(neigh).contains(node))
                    adjacencyList.get(neigh).remove(node);

            }

        }
        return false;
    }

    public void dfs(int source){

        Stack<Integer> stack = new Stack<>();
        stack.push(source);

        Set<Integer> seen = new HashSet<>();
        seen.add(source);

        while (!stack.isEmpty()){
            int node = stack.pop();

            for(int neigh: adjacencyList.get(node)){
                if(seen.contains(neigh)){
                    continue;
                }
                stack.push(neigh);
                seen.add(neigh);
            }
        }
        System.out.println(seen);
    }
}

public class IterativeDepthFirstSearchApp {
    public static void main(String[] args) {

        GraphTravel graphTravel = new GraphTravel(8);
        graphTravel.addEdge(0, 1);
        graphTravel.addEdge(0,2);
        graphTravel.addEdge(0,3);
        graphTravel.addEdge(2, 4);
        graphTravel.addEdge(1,5);
        graphTravel.addEdge(1,7);
        graphTravel.addEdge(3, 6);

        graphTravel.printAdjacency();

        //graphTravel.dfs(0);
        boolean hasCycle = graphTravel.dfsDetectCycle(0);
        System.out.println("Has Cycle: "+hasCycle);

    }
}
