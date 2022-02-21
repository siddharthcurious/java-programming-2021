package com.learn.coding.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<Integer>();

        marks.add(30);
        marks.add(78);
        marks.add(26);
        marks.add(96);
        marks.add(79);


        System.out.println("Marks: "+marks);

        List<Integer> updatedMarks = marks.stream()
                .map(i -> i * 6)
                .collect(Collectors.toList());

        System.out.println("Updated marks: "+updatedMarks);
    }
}
