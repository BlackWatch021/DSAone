/*
* Given a number
* find out whether it is the power of two or not .
* */
package com.company.Math;

public class powerOfTwo {
    public static void main(String[] args) {
//        int num=16;
        for (int i = 1; i <= 64; i++) {
            if (power(i)) {
                System.out.println(i);
            }
        }
    }
    //Approach1
    /*Taking the lcm of the passed number, if the remainder is not zero. Means the number is not the power of two
     * */
//    static boolean power(int num){
//        if(num==0 || num==1){
//            return false;
//        }
//        while(num>2){
//            if(num%2!=0){
//                return false;
//            }
//            num/=2;
//        }
//        return true;
//    }

    /*Approach 2
     * A number is power of two if it contains 1 bit only once in the binary form.
     * Because of the binary table                           16 8 4 2 1
     * If 1 occurs only once, means it is the power of two    1 0 0 0 0
     *                                                        0 1 0 0 0
     *                                                        0 0 1 0 0
     *                                                        0 0 0 1 0
     *
     * In this will count the occurrence of 1, if count is not equal to 1. Then return false
     * */

    static boolean power(int num){
        int count=0;
        if(num==0||num==1){
            return false;
        }
        while(num>0){
            if((num &1)==1){
                count+=1;
            }
            num=num>>1;
        }
        if(count!=1){
            return false;
        }
        return true;
    }
}
