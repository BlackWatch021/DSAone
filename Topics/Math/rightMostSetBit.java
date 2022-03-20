/*Given a number, find the position of the right most set(1) bit
* */
package com.company.Math_bitwise;

public class rightMostSetBit {
    public static void main(String[] args) {
        int num=8;
        System.out.println(nthPosition(num));
    }

    private static int nthPosition(int num) {
        int count=0;
        while(num>0){
            if((num&1)==1){
                count++;
                return count;
            }
            count++;
            num=num>>1;
        }
        return count;
    }
}
