package com.company.recursion;

public class print1ToNWithoutLoop_C {
    public static void main(String[] args) {
        int range = 10;
        printNosInAsc(range);
        System.out.println("");
        printNosInDec(range);
    }
    static void printNosInAsc(int N){
        if(N==0){
            return;
        }
        printNosInAsc(N-1);
        System.out.print(N+" ");
    }
    static void printNosInDec(int N){
        if(N==0){
            return;
        }
        System.out.print(N+" ");
        printNosInDec(N-1);
    }
}
