/*
Given a String, return the reverse of the string
* */
package com.company;

public class reverseAString_C {
    public static void main(String[] args) {
        String str="nam yeH ";
        System.out.println(reverseWord(str));
    }

    static String reverseWord(String str) {
       char[] charArr=str.toCharArray();
       String ans="";
        for (int i = charArr.length-1; i >=0; i--) {
            ans+=charArr[i];
        }
       return ans;
    }
}

