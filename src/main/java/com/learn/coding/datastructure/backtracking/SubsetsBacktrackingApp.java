package com.learn.coding.datastructure.backtracking;

import java.util.LinkedList;
import java.util.List;

class GenerateSubsets {

    public void generateSubsetsHelper(List<Integer> input){

    }

    public void generateSubsets(List<Integer> input){
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> output = new LinkedList<>();
    }
}

public class SubsetsBacktrackingApp {
    public static void main(String[] args) {

        GenerateSubsets generate = new GenerateSubsets();

        List<Integer> input = new LinkedList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        generate.generateSubsets(input);
    }
}
