/*
Given a range (a,b), we have to find the XOR of the number between them.
Approach 1
In this we will be iterating over the whole range.
Time complexity= O(b-a);

Approach 2
note If we XOR the same number again, then it will produce zero(removed);
there for first we will find the XOR from 0 to b;
then remove the unnecessary numbers = 0 to a-1
by doing the the XOR    (b^(a-1))
* */
package com.company.Math_bitwise;

public class XORRange_C {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        System.out.println(xor1(a,b));
        System.out.println(xor2(b)^xor2(a-1));
    }

    /*Approach 2-brute force*/
    static int xor1(int a,int b){
        int ans=0;
        for (int i = a; i <=b; i++) {
            ans=ans^i;
        }
        return ans;
    }



/*Approach 2*/
     static int  xor2(int num) {
        int remainder=num%4;
        switch (remainder){
            case 0:return num;
            case 1: return 1;
            case 2: return num+1;
            default: return 0;
        }
    }
}
