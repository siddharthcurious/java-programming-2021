package com.learn.coding.generics;

import java.util.Collection;
import java.util.LinkedList;

class GenericFunction {

    public <T> T displayElement(T element){
        System.out.println("Element display: "+ element);
        return element;
    }

    public <T> T addAndReturn(T element, Collection<T> collection){
        collection.add(element);
        return element;
    }
}
public class GenericFunctionsApp {
    public static void main(String[] args) {

        GenericFunction genericFunction = new GenericFunction();
        Integer a = genericFunction.displayElement(9088909);
        String s = genericFunction.displayElement("This is String.");

        System.out.println(a);
        System.out.println(s);

        Collection<Integer> collection = new LinkedList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);

        Integer d = genericFunction.addAndReturn(12345, collection);
        System.out.println("Added element: "+d);
        System.out.println(collection);

        Collection<String> collectionString = new LinkedList<>();
        collectionString.add("Hello");
        collectionString.add("Siddharth");
        collectionString.add("Kumar");
        collectionString.add("Gond");

        String d1 = genericFunction.addAndReturn("How are you?", collectionString);
        System.out.println("Added element: "+d1);
        System.out.println(collectionString);
    }
}
