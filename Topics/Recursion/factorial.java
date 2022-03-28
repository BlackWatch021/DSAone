package com.company.recursion;

public class factorial {
    public static void main(String[] args) {
        int num=4;
        System.out.println( factorial(num));
        
    }
    static int factorial(int num){
        if(num<=1){
            return num;
        }
        return (num * factorial(num-1));
    }
}
