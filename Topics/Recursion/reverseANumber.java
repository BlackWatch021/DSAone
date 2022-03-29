/*Return the reverse of a given number*/
package com.company.recursion;

public class reverseANumber {
    public static void main(String[] args) {
        int num=123456789;
        reverse(num);
        System.out.println(sum);
    }
    /*Approach 1
    * Using recursion method one
    * In this we are taking a variable outside the function to maintain our answer*/
    static int sum=0;
    static void reverse(int num){
        if(num==0){
            return;
        }
        sum=(sum*10)+(num%10);
        reverse(num/10);
    }
}
