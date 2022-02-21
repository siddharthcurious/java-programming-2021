package com.learn.coding.trick;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyMapApp {
    public static void main(String[] args) {
        String[] strings = {"this", "is", "a", "string", "array", "is", "is", "this"};

        Map<String,Long> frequncy = frequency(strings);

        System.out.println(frequncy);
    }

    public static Map<String, Long> frequency(String[] strings){
        return Arrays.stream(strings)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static Map<String, Integer> getFrequency( String [] words){
        Map<String, Integer> counter = new HashMap();
        for (String word: words)
            counter.put(word, counter.getOrDefault(word, 0) + 1);
        return counter;
    }

}
