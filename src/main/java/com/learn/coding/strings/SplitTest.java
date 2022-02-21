package com.learn.coding.strings;

public class SplitTest {
    public static void main(String[] args) {

        String s = "12345#23#";

        String [] tokens = s.split("#");

        System.out.println(tokens.length);


    }
}
