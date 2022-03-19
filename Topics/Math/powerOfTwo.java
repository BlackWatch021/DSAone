/*
* Given a number
* find out whether it is the power of two or not .
* */
package com.company.Math;

public class powerOfTwo {
    public static void main(String[] args) {
//        int num=16;
        for(int i=1;i<=64;i++){
            if(power(i)){
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
    
}
