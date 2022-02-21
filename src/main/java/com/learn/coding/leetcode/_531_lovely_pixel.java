package com.learn.coding.leetcode;

import java.util.HashMap;

class Solution531 {
    public int findLonelyPixel(char[][] picture) {

        HashMap<Integer, Integer> rowMap = new HashMap<>();
        HashMap<Integer, Integer> colMap = new HashMap<>();

        for(int i=0; i<picture.length; i++) {
            for(int j=0; j<picture[i].length; j++) {
                if(picture[i][j] == 'B')
                    rowMap.put(i, rowMap.getOrDefault(i,0)+1);
            }
        }

        for(int i=0; i<picture.length; i++) {
            for(int j=0; j<picture[i].length; j++) {
                if(picture[i][j] == 'B')
                    colMap.put(j, colMap.getOrDefault(j,0)+1);
            }
        }

        int ans = 0;

        for(int i=0; i<picture.length; i++) {
            for(int j=0; j<picture[i].length; j++) {
                if(picture[i][j] == 'B') {
                    if(rowMap.get(i) == 1 && colMap.get(j) == 1)
                        ans++;
                }
            }
        }

        return ans;
    }
}

public class _531_lovely_pixel {
    public static void main(String[] args) {

        Solution531 solution531 = new Solution531();
        char [][] matrix = {{'W','W','B'},{'W','B','W'},{'B','W','W'}};
        // char [][] matrix1 = {{'B','B','B'},{'B','B','W'},{'B','B','B'}};
        int out = solution531.findLonelyPixel(matrix);
        System.out.println(out);
    }
}
