package com.learn.coding.datastructure.backtracking;

import java.util.*;

class Solution {
    public void permuteHelper(List<Integer> input, List<Integer> choosen, int comblen, Set<List<Integer>> result){
        if(choosen.size() == comblen){
            List<Integer> perm = new LinkedList<>(choosen);
            result.add(perm);
        } else {

            for(int i = 0; i < input.size(); i++){

                choosen.add(input.get(i));
                input.remove(i);

                permuteHelper(input, choosen, comblen, result);

                input.add(i, choosen.get(choosen.size()-1));
                choosen.remove(choosen.size()-1);

            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<Integer> input = new LinkedList<>();
        List<Integer> choosen = new LinkedList<>();
        Set<List<Integer>> result = new HashSet<>();
        for(int num: nums){
            input.add(num);
        }
        int comb = 3;
        permuteHelper(input, choosen, comb, result);
        return new LinkedList<>(result);
    }
}

public class PermutationApp {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] numbers = new int[]{1,2,3};
        System.out.println("Numbers:"+ Arrays.toString(numbers));
        List<List<Integer>> res = solution.permuteUnique(numbers);
        System.out.println("Permutations: ");
        for(List<Integer> d: res){
            System.out.println(d);
        }
    }
}
