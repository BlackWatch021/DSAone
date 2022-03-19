package com.company.Math;

public class decimalToOctal_SC {
    public static void main(String[] args) {
        int num=8;
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
        int toReturn=0;

        //Rotating the obtained number
        while(ans>0){
            toReturn=(toReturn*10)+(ans%10);
            ans/=10;
        }
        return toReturn;
    }
}
