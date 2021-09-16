package com.learn.coding.leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public String product(String num1, Character digit){

        if(num1.equals("0")) return "0";
        if(digit.equals('0')) return "0";

        int d = Character.getNumericValue(digit);
        String result = "";
        int carry = 0;
        int rem = 0;
        int num = 0;
        for(int i = num1.length()-1; i >= 0; i--){

            num = (Character.getNumericValue(num1.charAt(i)) * d) + carry;
            if( num > 9) {
                carry = num / 10;
                rem = num % 10;
                result = rem + result;
            } else {
                carry = 0;
                result = num + result;
            }

        }
        if( carry > 0) {
            result = carry + result;
        }
        return result;
    }

    public String addition(String num1, String num2){

        if(num1.equals("0")) return num2;
        if(num2.equals("0")) return num1;

        int len1 = num1.length()-1;
        int len2 = num2.length()-1;

        int carry = 0;
        int sum = 0;
        int rem = 0;
        String result = "";
        while( len1 >= 0 && len2 >= 0){
            sum = Character.getNumericValue(num1.charAt(len1)) + Character.getNumericValue(num2.charAt(len2)) + carry;
            if(sum > 9){
                carry = sum / 10;
                rem = sum % 10;
                result = rem + result;
            } else {
                carry = 0;
                result = sum + result;
            }
            len1--;
            len2--;
        }
        if(len1 < 0 && len2 < 0 && carry > 0){
            result = carry + result;
            return result;
        }
        else if(len1 < 0 && len2 >= 0){
            while(len2 >= 0){
                sum =  Character.getNumericValue(num2.charAt(len2)) + carry;
                if(sum > 9){
                    carry = sum / 10;
                    rem = sum % 10;
                    result = rem + result;
                } else {
                    carry = 0;
                    result = sum + result;
                }
                len2--;
            }
        }
        else if( len1 >= 0 && len2 < 0){
            while(len1 >= 0){
                sum =  Character.getNumericValue(num1.charAt(len1)) + carry;
                if(sum > 9){
                    carry = sum / 10;
                    rem = sum % 10;
                    result = rem + result;
                } else {
                    carry = 0;
                    result = sum + result;
                }
                len1--;
            }
        }

        if(carry > 0){
            result = carry + result;
        }
        return result;
    }

    public String multiply(String num1, String num2) {
        //List<String> data = new ArrayList<>();
        if(num1.equals("0") || num2.equals("0")) return "0";

        String finalSum = "0";
        int c = 0;
        int j = 0;
        for(int i = num2.length()-1; i >= 0; i--){
            String p = product(num1, num2.charAt(i));
            String appender = "";
            while(c > 0){
                appender = appender + "0";
                c--;
            }
            j++;
            c = j;
            p = p + appender;
            //data.add(p);
            finalSum = addition(finalSum, p);
        }
        //System.out.println(data);
        return finalSum;
    }
}

public class _43_Multiply_Strings {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String m = sol.multiply("99", "99000");
        System.out.println(m);

//        String res = sol.product("99", '9');
//        String sum = sol.addition("90909", "9");
//        System.out.println(res);
//        System.out.println(sum);
    }
}
