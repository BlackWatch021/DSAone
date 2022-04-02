/*
* Given the a number 'num', find the sum of all numbers from range 1-num*/
package com.company.recursion;

public class sumOfNNumbers {
    public static void main(String[] args) {
        int num=11;
        System.out.println(rangeRec(num));
        System.out.println(rangeLoop(num));
    }
    /*Approach 2
    * Find the sum in the given range using Recursion*/
    static int rangeRec(int num){
        if(num<1){
            return 0;
        }
        return num+rangeRec(num-1);
    }
    /*Approach 1
    * Find the sum in the given range using Loop*/
    static int rangeLoop(int num){
        int ans=0;
        while(num>0){
            ans+=num;
            --num;
        }
        return ans;
    }
}
