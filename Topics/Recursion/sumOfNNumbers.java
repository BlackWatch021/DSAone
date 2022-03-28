/*
* Given the a number 'num', find the sum of all numbers from range 1-num*/
package com.company.recursion;

public class sumOfNNumbers {
    public static void main(String[] args) {
        int num=5;
        System.out.println(rangeRec(num));
    }
    /*Approach 2
    * Find the sum in the given range using Recursion*/
    static int rangeRec(int num){
        if(num<1){
            return 0;
        }
        return num+rangeRec(num-1);
    }
}
