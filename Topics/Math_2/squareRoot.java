/*
Find the square root of the given number
Note-The given number is a perfect square
EX-4,9,16.....
* */
package com.company.Math_2;

public class squareRoot {
    public static void main(String[] args) {
        int num=24;
        System.out.println(root(num));
    }
    /*Approach 1
    In this we will check for every number starting from 2 till the passed number;
    * */
    static int root(int num){
        for (int i = 2; i < num; i++) {
            if(i*i==num){
                return i;
            }
        }
        return -1;
    }
}
