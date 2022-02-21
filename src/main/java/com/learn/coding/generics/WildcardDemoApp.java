package com.learn.coding.generics;

import java.util.Arrays;
import java.util.List;

public class WildcardDemoApp {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Double> list2 = Arrays.asList(1.2, 2.5, 5.6, 7.8, 9.10);

        System.out.println("Sum Integer :"+sum(list1));
        System.out.println("Sum Double :"+sum(list2));
    }

    public static double sum(List<? extends Number> list){
        double sum = 1.0;
        for(Number i: list){
            sum = sum + i.doubleValue();
        }
        return sum;
    }
}
