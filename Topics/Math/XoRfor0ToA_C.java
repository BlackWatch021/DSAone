/*jWe have to find the value of XoR from zero to A

   a        XOR from 0 to a         value
   0              0                   0
   1              0^1                 1
   2              0^1^2               3
   3              0^1^2^3             0
   4              0^1^2^3^4           4
   5              0^1^2^3^4^5         1
   6              0^1^2^3^4^5^6       7
   7              0^1^2^3^4^5^6^7     0
   8              0^1^2^3^4^5^6^7^8   8

   notice that the pattern is repeating. If the remainder
   cases-
   1.If remainder is zero= ans=a
   2.If remainder is one=  ans=1
   3.If remainder is two=  ans=a+1;
   4.If remainder is three= 0
* */
package com.company.Math_bitwise;

public class XoRfor0ToA_C {
    public static void main(String[] args) {
//        int num=2;
        for (int i = 0; i < 13; i++) {
            System.out.println(i+":"+from0tonum(i));
        }
    }

    private static int  from0tonum(int num) {
        int remainder=num%4;
        switch (remainder){
            case 0:return num;
            case 1: return 1;
            case 2: return num+1;
            default: return 0;
        }

    }
}
