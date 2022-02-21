package com.learn.coding.generics;

import java.util.LinkedList;
import java.util.List;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}

public class GenericKeyValue {
    public static void main(String[] args) {

        Pair<String, String> pair = new Pair<String, String>("Siddharth", "Kumar");
        Pair<Integer, String> pair1 = new Pair<Integer, String>(1, "Hey, This is String");
        Pair<Integer, Integer> pair2 = new Pair<Integer, Integer>(1, 2);
        Pair<Integer, Double> pair3 = new Pair<Integer, Double>(30, 30.90);

        List<Pair> data = new LinkedList<Pair>();
        data.add(pair);
        data.add(pair1);
        data.add(pair2);
        data.add(pair3);

        for(Pair p: data){
            System.out.println(p);
        }
    }
}
