package com.learn.coding.datastructure.dynamic_programming;

class RodCutter {
    public int cutRod( int [] price, int n){
        if(n == 0){
            return 0;
        }

        int q = -1;
        for(int i = 1; i <= n; i++) {
            q = Math.max(q, price[i] + cutRod(price, n - i));
        }
        return q;
    }
}
public class RodCuttngApp {
    public static void main(String[] args) {

        int [] prices = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        int rodlength = 5;

        RodCutter rodCutter = new RodCutter();
        int revenue = rodCutter.cutRod(prices, rodlength);
        System.out.println(revenue);
    }
}
