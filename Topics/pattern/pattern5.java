/*
print this pattern
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

* */
package com.company.pattern;

public class pattern5 {
    public static void main(String[] args) {
        int num=5;
        pattern(num);
    }
    static void pattern(int num){
        for (int row = 0; row < 2*num; row++) {
            int totalColsInRow=row>num?2*num-row:row;
            for (int col = 0; col <totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
