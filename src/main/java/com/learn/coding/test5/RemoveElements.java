package com.learn.coding.test5;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RemoveElements {
    public static void main(String[] args) {
        int [] numbers = {3,3,3,3,5,5,5,2,2,7};
        int ans = getUniqRemoveCount(numbers);
        System.out.println("Output: "+ans);
    }

    public static Map<Integer, Integer> getFrequency(int [] numbers){

        Map<Integer, Integer> counter = new HashMap<>();
        for(Integer num: numbers){
            counter.put(num, counter.getOrDefault(num, 0)+1);
        }
        //System.out.println(counter);
        return counter;
    }

    public static int getUniqRemoveCount(int [] numbers){

        int length = numbers.length;
        int halfLength = length/2;

        PriorityQueue<int []> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        Map<Integer, Integer> freq = getFrequency(numbers);

        for(Map.Entry entry: freq.entrySet()){
            int [] node = new int[2];
            node[0] = (int)entry.getKey();
            node[1] = (int)entry.getValue();

            pq.add(node);

        }
        int count = 0;
        int uniqCount = 0;
        while(!pq.isEmpty()){
            int [] node = pq.poll();
            //System.out.println("key: "+node[0]+" value: "+node[1]);
            count = count + node[1];
            uniqCount++;
            if(count >= halfLength){
                return uniqCount;
            }
        }
        return 0;
    }
}
