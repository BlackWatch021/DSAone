package com.company.recursion;

public class countNumberOf0 {
    public static void main(String[] args) {
        int num=30410040;
        System.out.println(count(num));
    }
    static int count(int num){
        return helper(num,0);
    }
    static int helper(int num,int count){
        if(num==0){
            return count;
        }
        else if(num%10==0){//Change 0 to count another numbers
            return helper(num/10,count+1);
        }
        else{
            return helper(num/10,count);
        }
    }
}
