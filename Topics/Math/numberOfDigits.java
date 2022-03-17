/*Total number of digits */
package com.company.Math;

public class numberOfDigits {
    public static void main(String[] args) {
        int num=10;
        int base=8;
//        System.out.println(totalNumber(num));
        System.out.println(totalDigits(num,base));
    }

    //brute force approach for binary system
//    static int totalNumber(int num){
//        int count=0;
//        while(num>0){
//            num=num>>1;
//            ++count;
//        }
//        return count;
//    }
    /*Defining separate function for each number system is a bit annoying, hence we can use a predefined formula

    * */

    static int totalDigits(int num,int base){
        return (int)(Math.log(num)/Math.log(base))+1;
    }
}
