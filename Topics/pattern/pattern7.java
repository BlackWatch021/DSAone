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

public class pattern7 {
    public static void main(String[] args) {
        int num=5;
        pattern(num);
    }
    static void pattern(int num){
        for (int row = 1; row <=num; row++) {
            for (int i = 1; i <=num-row; i++) {
                System.out.print("  ");
            }
            for (int i = row; i >= 1; i--) {
                System.out.print(i+" ");
            }
            for (int i = 2; i <=row ; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
