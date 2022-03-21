/*

Given a number, find whether it is prime or not.
Prime number-Number divisible by itself and one only;
* */
package com.company.Math_2;

public class primeNumber {
    public static void main(String[] args) {
//        int num=7;
        int count=0;
        for (int i = 0; i <= 100; i++) {
            if(isPrime(i)){
                System.out.println(i+":"+ isPrime(i));
                count++;
            }
        }
        System.out.println(count);
    }
    /*Approach 2
    Approach 1 has the draw back as it is useful for a particular range only.
    But not with approach 2
    SO for Primality Test of a number ,take the square root of the number;
    Then take all the number smaller than the square root of the number but bigger than 2 and check whether the
    number is divisible by these numbers.
    If YES, then it's not prime
    Else it is a prime number

    we take the square root of the number because that allow us to reduce the number means less time complexity
    EX-num=81
    Approach1-either we can check for the divisibility of num with each number from 2-(num-1).
       Time complexity=O(n-2)
    Approach2-reduce the size, by taking the square root. Then checking it is divisible by number less than
    it(square root number)
       Time complexity=O(sqrt(num))
    c<sqrt(num)
    or
    c*c<num   taking square both side
    */
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        int c=2;
        while(c*c<=num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return true;
    }


    /*Approach 1
    Draw-back=This method is useful till the range 0-121
    Since the smallest possible factor of any number are 2,3,4,5.
    If the number is divisible by even one of them, then its not a prime number.
    If the number is not divisible by these(2,3,4,5), then it a prime number

    Include 7
    cause there are some edge cases, only divisible by 7
    ex-49,77,97
    * */
//    static boolean isPrime(int num){
//        if(num==2 || num==3 || num==5 || num==7){
//            return true;
//        }
//        if(num<=1 || num%2==0 || num%3==0 || num%4==0 || num%5==0 || num%7==0){
//            return false;
//        }
//        return true;
//    }

}
