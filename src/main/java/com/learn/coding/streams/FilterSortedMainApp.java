package com.learn.coding.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

enum TYPE {
    GROCERY, CLOTHS, EDUCATION;
}

class Transaction {

    TYPE type;
    int value;

    public Transaction(TYPE type, int value) {
        this.type = type;
        this.value = value;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type=" + type +
                ", value=" + value +
                '}';
    }
}

public class FilterSortedMainApp {
    public static void main(String[] args) {

        Transaction t1 = new Transaction(TYPE.CLOTHS, 1000);
        Transaction t2 = new Transaction(TYPE.GROCERY, 2000);
        Transaction t3 = new Transaction(TYPE.CLOTHS, 1500);
        Transaction t4 = new Transaction(TYPE.EDUCATION, 800);
        Transaction t5 = new Transaction(TYPE.CLOTHS, 700);
        Transaction t6 = new Transaction(TYPE.GROCERY, 2020);
        Transaction t7 = new Transaction(TYPE.EDUCATION, 900);
        Transaction t8 = new Transaction(TYPE.GROCERY, 800);
        Transaction t9 = new Transaction(TYPE.EDUCATION, 6000);
        Transaction t10 = new Transaction(TYPE.GROCERY, 550);

        List<Transaction> transactionList = new ArrayList<>();

        transactionList.add(t1);
        transactionList.add(t2);
        transactionList.add(t3);
        transactionList.add(t4);
        transactionList.add(t5);
        transactionList.add(t6);
        transactionList.add(t7);
        transactionList.add(t8);
        transactionList.add(t9);
        transactionList.add(t10);

        System.out.println(transactionList);

        for(Transaction t: transactionList){
            System.out.println(t);
        }

        List<Integer> transactionsGrocery = transactionList.stream()
                .filter(t -> t.getType() == TYPE.GROCERY)
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .map(Transaction::getValue)
                .collect(Collectors.toList());

        System.out.println();
        for(Integer t: transactionsGrocery){
            System.out.println(t);
        }


    }
}
