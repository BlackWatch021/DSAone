/*
Find the square root of the given number
Note-The given number is a perfect square
EX-4,9,16.....
* */
package com.company.Math_2;

public class squareRoot {
    public static void main(String[] args) {
        int num=17;
        System.out.println(root(num));
    }
    /*Approach 1
    In this we will check for every number starting from 2 till the passed number;
    * */
//    static int root(int num){
//        for (int i = 2; i < num; i++) {
//            if(i*i==num){
//                return i;
//            }
//        }
//        return -1;
//    }

    /*Approach 2
   Since we know the range, 2 - num.
   Then can't we use Binary search
    * */
   static int root(int num){
       int start=0;
       int end=num;
       while(start<=end){
           int mid=(end+start)/2;
           if(mid*mid>num){
               end=mid-1;
           }
           else if(mid*mid<num){
               start=mid+1;
           }
           else{
               return mid;
           }
       }
       return -1;
    }
}
