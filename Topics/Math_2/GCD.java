/*
* HCF/GCD
* Here we are using the Euclidean formula
  i.e
  *
  * gcd(a,b)=gcd(remainder(b,a),a);
  * gcd(a,b)=gcd((b%a),a)
  *
  * run this code till a becomes zero
  *
* HCF=Highest common factor
* GCD=Greatest common factor*/
package com.company.Math_2;

public class GCD {
    public static void main(String[] args) {
        int a=14;
        int b=105;
        System.out.println(gcd(a,b));
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
