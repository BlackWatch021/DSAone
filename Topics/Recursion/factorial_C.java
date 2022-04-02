package com.company.recursion;

public class factorial {
    public static void main(String[] args) {
        int num=6;
        System.out.println( factorialRec(num));
        System.out.println(factorailLoop(num));
    }
    /*Approach 2
    * Finding the factorial of a number using recursion*/
    static int factorialRec(int num){
        if(num<=1){
            return 1;
        }
        return (num * factorialRec(num-1));
    }
    /*Approach 1
    * Finding the factorial of a number using loop*/
    static int factorailLoop(int num){
        int ans=1;
        while(num>1){
            ans*=num;
            --num;
        }
        return ans;
    }
}
