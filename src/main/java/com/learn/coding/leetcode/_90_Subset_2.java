package com.learn.coding.leetcode;

import java.util.*;

class Solution90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Deque<List<Integer>> deque = new ArrayDeque<>();
        List<Integer> emptysubset = new LinkedList<>();
        deque.add(emptysubset);

        for(int num: nums){
            List<List<Integer>> tempSubs = new LinkedList<>();
            while (!deque.isEmpty()){
                tempSubs.add(deque.poll());
            }

            for(List<Integer> sub: tempSubs){
                List<Integer> newSub = new LinkedList<>(sub);
                deque.add(newSub);
                List<Integer> updatedSub = new LinkedList<>(sub);
                updatedSub.add(num);
                deque.add(updatedSub);
            }
        }
        Set<List<Integer>> set = new HashSet<>();
        for (List<Integer> sub: deque){
            Collections.sort(sub);
            set.add(sub);
        }
        return new LinkedList<>(set);
    }
}

public class _90_Subset_2 {

    public static void main(String[] args) {

        Solution90 solution = new Solution90();
        int [] data = new int[] {1,2,2};
        solution.subsetsWithDup(data);
    }
}
