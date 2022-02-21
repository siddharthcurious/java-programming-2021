package com.learn.coding.trick.set;

import java.util.HashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        String data = "hellofriends";

        Set<Character> set = new HashSet<>();

        for(Character ch: data.toCharArray()){
            set.add(ch);
        }
    }
}
