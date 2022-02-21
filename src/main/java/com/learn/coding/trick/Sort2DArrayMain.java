package com.learn.coding.trick;

import java.util.Arrays;
import java.util.Comparator;

class ComparatorArray implements Comparator<int[]> {

    @Override
    public int compare(int[] o1, int[] o2) {
        return o1[0] - o2[0];
    }
}

public class Sort2DArrayMain {
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

        Arrays.sort(data, new ComparatorArray());

        for(int [] d: data){
            System.out.println(Arrays.toString(d));
        }
    }
}
