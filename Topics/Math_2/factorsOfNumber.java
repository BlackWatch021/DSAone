/*
* Given a number, return all the factors for this number*/
package com.company.Math_2;



public class factorsOfNumber {
    public static void main(String[] args) {
        int num = 25;
//        factors(num);
        factors2(num);
    }

    /*Approach 2
     * It is more optimize solution
     * Let the number is 20, then its factors are 1,2,4,5,10,20
     * Observe In brute force, we are iterating over the same numbers twice
     * 2*10=20 || 10*2=20
     * 4*5=20  || 5*4=20
     * 1*20=20 || 20*1=20
     *
     * So what we can do it take the square root of the number, then the obtained number will be our range
     * range = 1 - square root of number
     * But keep in mind that we will get two answers if the condition num%i==0 is true
     *
     * 1st=i
     * 2nd=number/i
     *
     * EX-
     * Number=20
     * i=4
     * 2nd=20/4=>5
     *
     * In some cases the number might repeat itself, so we have to add a check for it
     *
     * Notice this approach is not giving the sorted result
     * Time complexity=O(SquareRoot of number)
     * Space complexity=O(1)*/
    static void factors2(int num){
        for (int i = 1; i <=Math.sqrt(num); i++) {
            if(num%i==0){
                if(num/i==i){
                    System.out.println(i);
                }
                else{
                    System.out.print(i+" "+num/i+" ");
                }
            }
        }
    }




    /*Approach 1
    * brute force, we are checking for each number
    * Time complexity =O(n)
    * Space complexity=O(1) constant*/
    static void factors(int num){
        for (int i = 1; i <=num; i++) {
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
