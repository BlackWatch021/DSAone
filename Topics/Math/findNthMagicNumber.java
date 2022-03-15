package com.company.Math;

public class findNthMagicNumber {
    public static void main(String[] args) {
        int num=6;
        System.out.println(magicNumber(num));
    }
    static int magicNumber(int num){

        int ans=0;
        int base=5;
        while(num>0){
            int last=num & 1;
            num=num>>1;
            ans+=base*last;
            base*=5;
        }
        return ans;
    }
}
/*
* nth magic number is obtained by multiplying each bit with the power of 5 then adding them together.
* Power of 5 increases form 1 to n
* Ex-
* num= 101101;
* nth magic number=1*(5^6)+0*(5^5)+1*(5^4)+1*(5^3)+0*(5^2)+1*(5^1)
* */