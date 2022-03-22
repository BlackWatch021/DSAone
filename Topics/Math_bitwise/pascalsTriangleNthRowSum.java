/*
In the pascale triangle
we have to find the sum of the nth row

pascale triangle
ex
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
.....

Properties of pascale triangle
sum of each row=nC0+nC1+nC2+nC3+nC4+nC5+nC6+nC7+.....+nCn = 2^n
Its combination


for nth row it will be 2^n-1
because we are starting from 0;
* */

package com.company.Math_bitwise;

public class pascalsTriangleNthRowSum {
    public static void main(String[] args) {
        //nth>0
        int nth=1;
        System.out.println(nthSum(nth));
    }
    static int nthSum(int n){
        return 1<<n-1;
    }
}
