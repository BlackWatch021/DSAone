/*
* Here we are using the formula
   hcf*lcm=a*b
   lcm=(a*b)/hcf
* */
package com.company.Math_2;

public class LCM {
    public static void main(String[] args) {
        int a=2;
        int b=4;
        int hcf=hcf(a,b);
        System.out.println(lcm(a,b,hcf));
    }
    static int lcm(int a,int b,int hcf){
        return (a*b)/hcf;
    }
    static int hcf(int a, int b){
        if(a==0){
            return b;
        }
        return hcf(b%a,a);
    }
}
