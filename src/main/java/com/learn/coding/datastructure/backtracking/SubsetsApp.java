package com.learn.coding.datastructure.backtracking;

import java.util.*;

class SubsetsGenerator {
    public void getSubsets(List<Integer> input){
        Stack<Set<Integer>> stack = new Stack<>();
        Set<Integer> subset = new HashSet<>();
        stack.push(subset);

        for(Integer d: input){
            List<Set<Integer>> data = new LinkedList<>();
            while (!stack.isEmpty()){
                Set<Integer> sub = stack.pop();
                data.add(sub);
            }
            for(Set<Integer> s: data){
                Set<Integer> newsub = new HashSet<>(s);
                stack.push(newsub);
                Set<Integer> newsub2 = new HashSet<>(s);
                newsub2.add(d);
                stack.push(newsub2);
            }
        }
        System.out.println(stack);
    }
}

public class SubsetsApp {
    public static void main(String[] args) {
        SubsetsGenerator subsetsGenerator = new SubsetsGenerator();
        List<Integer> input = new LinkedList<>(Arrays.asList(1,2,3));
        subsetsGenerator.getSubsets(input);
    }
}
