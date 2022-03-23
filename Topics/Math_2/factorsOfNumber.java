/*
* Given a number, return all the factors for this number*/
package com.company.Math_2;



public class factorsOfNumber {
    public static void main(String[] args) {
        int num=20;
        factors(num);
    }
    /*Approach 1
    * brute force, we are checking for each number
    * Time complexity =O(n-1)
    * Space complexity=O(1) constant*/
    static void factors(int num){
        for (int i = 1; i <=num; i++) {
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
