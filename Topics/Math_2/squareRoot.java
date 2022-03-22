/*
Find the square root of the given number
Note-The given number is a perfect square
EX-4,9,16.....
* */
package com.company.Math_2;

public class squareRoot {
    public static void main(String[] args) {
        int num=20;
        int precision=3;
//        System.out.println(root1(num));
        for (int i = 0; i < 21; i++) {
        System.out.println(i+":"+precision(i,precision));
        }
    }

    /*
    Approach 3
    In this we will be finding the precision value of the root.
    For this first we will find the number greater than or less than the square of the number.
    Then will add the number at the decimal place and iterate it till the answer is not found.
    Here we are taking second argument, this argument tells upto which decimal place we want the answer
    * */
    static double precision(int num, int times){
        int start=0;
        int end=num;

        double ans=0.0;
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
        ans=start-1;
        double  increment=0.1;
        for (int i = 0; i < times; i++) {
            while(ans*ans<=num){
                ans+=increment;
            }
            ans-=increment;
            increment/=10;

        }
        return ans;
    }

    /*Approach 2
   Since we know the range, 2 - num.
   Then can't we use Binary search
    * */
   static int root1(int num){
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


    /*Approach 1
    In this we will check for every number starting from 2 till the passed number;
    * */
    static int root2(int num){
        for (int i = 2; i < num; i++) {
            if(i*i==num){
                return i;
            }
        }
        return -1;
    }
}
