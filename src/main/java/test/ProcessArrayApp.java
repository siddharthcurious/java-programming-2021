package test;

import java.util.Arrays;

public class ProcessArrayApp {
    public static void main(String[] args) {
        int [] input = { 2, 2, 4, 5, 0, 0, 5, 5, 4, 8, 6, 0, 6, 8};
        changeArray(input);
        System.out.println(Arrays.toString(input));
    }

    public static void changeArray( int [] input){

        int i = 0;
        int j = 1;

        int prev;
        int current;

        while(i < input.length && j < input.length) {
            prev = input[i];
            current = input[j];
            if (prev != 0 && current != 0) {
                if (prev == current) {
                    input[i] = 0;
                    input[j] = 2 * current;
                    i++;
                    j++;
                } else {
                    i++;
                    j++;
                }
            } else if (prev != 0 && current == 0) {
                j++;
            } else if (prev == 0 && current != 0) {
                i++;
                if (i == j) {
                    j++;
                }
            }
        }

        int p = 0;
        int k = input.length - 1;

        while(p < k){
            if(input[p] == 0 && input[k] != 0){
                int temp = input[p];
                input[p] = input[k];
                input[k] = temp;
            }
            if(input[p] != 0){
                p++;
            }
            if(input[k] == 0){
                k--;
            }
        }
    }
}
