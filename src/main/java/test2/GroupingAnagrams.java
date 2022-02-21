package test2;

import java.util.*;

public class GroupingAnagrams {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("act");
        input.add("dog");
        input.add("mat");
        input.add("cat");
        input.add("god");
        input.add("tac");
        input.add("pot");
        input.add("heellooo");
        input.add("helloooe");

        System.out.println(getAnagrams(input));
    }

    public static Map<Character, Integer> getFrequency(String word){
        Map<Character, Integer> frequency = new HashMap<>();
        for(int i = 0; i < word.length(); i++){
            frequency.put(word.charAt(i), frequency.getOrDefault(word.charAt(i), 0)+1);
        }
        return frequency;
    }

    public static List<String> getAnagrams(List<String> words) {

        //Set<Map<Character, Integer>> uniqs = new HashSet<>();

        Map<String, List<String>> groupAnagrams = new HashMap<>();

//        for(String word: words){
//            Map<Character, Integer> charCounts = getFrequency(word);
//            uniqs.add(charCounts);
//        }

        for(String word: words){
            //Map<Character, Integer> freq = getFrequency(word);
            char [] w = word.toCharArray();
            Arrays.sort(w);
            String sortedString = new String(w);

            if(groupAnagrams.containsKey(sortedString)){
                List<String> grouped = groupAnagrams.get(sortedString);
                grouped.add(word);
                //groupAnagrams.put(sortedString, grouped);
            }
            else {
                List<String> data = new LinkedList<>();
                data.add(word);
                groupAnagrams.put(sortedString, data);
            }
        }

        System.out.println(groupAnagrams);

        List<String> res = new ArrayList<>();

        for(Map.Entry entry: groupAnagrams.entrySet()){
            List<String> l = (List<String>) entry.getValue();
            res.addAll(l);
        }

        return res;
    }
}
