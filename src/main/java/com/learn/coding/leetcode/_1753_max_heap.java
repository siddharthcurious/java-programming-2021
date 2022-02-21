package com.learn.coding.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution1735 {
    public int maximumScore(int a, int b, int c) {
        int res = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(a);
        pq.offer(b);
        pq.offer(c);

        while(pq.size() > 1) {
            int temp1 = pq.poll();
            int temp2 = pq.poll();

            if(temp1 > 0 && temp2 > 0){
                res++;
                temp1--;
                temp2--;
            }

            if(temp1 != 0) pq.offer(temp1);
            if(temp2 != 0) pq.offer(temp2);
        }
        return res;
    }
}

public class _1753_max_heap {
    public static void main(String[] args) {

    }
}
