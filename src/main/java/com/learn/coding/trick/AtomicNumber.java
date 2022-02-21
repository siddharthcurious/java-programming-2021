package com.learn.coding.trick;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicNumber {
    public static void main(String[] args) {
         AtomicInteger counter = new AtomicInteger();
         for(int i = 0; i < 100; i++){
             System.out.println(counter.getAndIncrement());
         }
    }
}
