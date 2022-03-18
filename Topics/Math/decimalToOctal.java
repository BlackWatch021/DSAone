package com.company.Math;

public class decimalToOctal {
    public static void main(String[] args) {
        int num=10;
        System.out.println(toOctal(num));
    }
    static int toOctal(int num){
        int remainder=0;
        int ans=0;
        while(num>0){
            remainder=num%8;
            ans=remainder+(ans*10);
            num/=10;
        }
        return ans;
    }
}
