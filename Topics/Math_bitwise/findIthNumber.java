package com.company.Math;

public class findIthNumber {
    public static void main(String[] args) {
        int num=10;
        int ith=0;
        System.out.println(ithNumber(num,ith));
    }
    static int ithNumber(int num,int ith){
        int i=1<<ith-1;
        System.out.println(num & i);
        if((num & i)!=0){
            return 1;
        }
        return 0;
    }
}

/*
* For better clarity dry run the program(use pen paper)
*
* */
