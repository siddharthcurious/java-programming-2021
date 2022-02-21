package com.learn.coding.trick;

import java.util.Arrays;

public class SortUsingLambda {
    public static void main(String[] args) {
        int [][] data = {
                {20190101,0,1},
                {20190104,3,4},
                {20190107,2,3},
                {20190211,1,5},
                {20190224,2,4},
                {20190301,0,3},
                {20190312,1,2},
                {20190322,4,5}
        };

        Arrays.sort(data, (a, b) -> a[0] - b[0]);

        for(int [] d: data){
            System.out.println(Arrays.toString(d));
        }
    }
}
