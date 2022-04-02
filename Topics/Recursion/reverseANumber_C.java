/*Return the reverse of a given number*/
package com.company.recursion;

public class reverseANumber {
    public static void main(String[] args) {
        int num=24;
        reverse(num);
//        System.out.println(sum);
        System.out.println(reverse2(num));
    }
    /*Approach 2
    It is possible that we need some extra variable for keep the record or to save something, then it is recommended
    we use a separate function for this(helper function) in recursion.
    Here we are doing this.
    ex num=4321;
    so 4*1000 + reverse(321)
       4*1000 +    3*100 +    reverse(21)
       4*1000 +    3*100 +    +   2*10  +    reverse(1)
       4*1000 +    3*100 +    +   2*10  +        1

    * */
    static int reverse2(int num){
       int len=(int)(Math.log10(num)+1);//To find the length of the number
       return helper(num,len);
    }
    static int helper(int num, int len){
        if(num<10){
            return num;
        }
        return num%10*(int)(Math.pow(10,len-1))+helper(num/10,len-1);
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
