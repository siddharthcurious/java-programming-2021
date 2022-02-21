package com.learn.coding.test5;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CollisionSteroid {
    public static void main(String[] args) {

    }

    public static int [] getState( int [] numbers){

        Stack<Integer> stk = new Stack<>();

        for(int i = 0; i < numbers.length; i++) {
            int currentElement = numbers[i];
            if(stk.isEmpty()){
                stk.push(currentElement);
            }
            else if(stk.peek() > 0 && currentElement < 0) {
                if(stk.peek() == Math.abs(currentElement)){
                    stk.pop();
                }

                while(!stk.isEmpty()){

                }
            }
            else {
                stk.push(currentElement);
            }
        }
        return new int[2];
    }
}
