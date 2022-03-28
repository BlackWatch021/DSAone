package com.company.recursion;

public class print1ToNWithoutLoop_C {
    public static void main(String[] args) {
        int range = 10;
        printNos(range);
    }
    static void printNos(int N){
        if(N==0){
            return; 
        }
        printNos(N-1);
        System.out.print(N+" ");
    }
}
