package com.company.Math;

public class evenOddInBinary {
    public static void main(String[] args) {
        int n =23;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return (n & 1)==1;
    }
}
/*
WE are using binary here, n is first converted into binary by the program at the basic level.
Then we are performing and operation with 1 on the passed number. It will give us the value of  last digit
of the binary form.
If its ==1, means it is odd
It its !=1, means it is even
* */
