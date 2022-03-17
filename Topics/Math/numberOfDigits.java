/*Total number of digits */
package com.company.Math;

public class numberOfDigits {
    public static void main(String[] args) {
        int num=2;
        System.out.println(totalNumber(num));
    }

    //brute force approach for binary system
    static int totalNumber(int num){
        int count=0;
        while(num>0){
            num=num>>1;
            ++count;
        }
        return count;
    }
}
